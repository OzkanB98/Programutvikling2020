package org.openjfx.models.filbehandling;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;
import org.openjfx.models.avvik.*;
import org.openjfx.models.datavalidering.CsvValidering;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


public class CSVLeser implements Leser {
    CsvValidering csvValidering;

    @Override
    public void lesFraFil(File file, TilLagring obj) throws Exception {
        tomFil(file);
        obj = new TilLagring();
        obj.setKomponentArrayList(new ArrayList<>());
        csvValidering = new CsvValidering();

        CSVParser csvParser = new CSVParserBuilder()
                .withSeparator(';')
                .withIgnoreQuotations(true)
                .build();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader(file))
                .withCSVParser(csvParser)
                .withSkipLines(0)
                .build();
        int lineNumber = 0;
        String[] rad;
        while ((rad = csvReader.readNext()) != null) {
            lineNumber++;
            validerRad(rad, lineNumber);
            validerData(rad, lineNumber);
            Komponent komponent = new Komponent(rad[0], rad[1], rad[2], rad[3], Double.valueOf(rad[4]));

            obj.getKomponentArrayList().add(komponent);
        }
        csvReader.close();
    }

    private void validerRad(String[] rad, int lineNumber) throws CsvWrongSeparatorException, CsvMissingRowException {
        if (!(rad.length == 5)) {
            if(rad.length == 1) {
                throw new CsvWrongSeparatorException(lineNumber);
            }
            throw new CsvMissingRowException(lineNumber);
        }
    }

    private void validerData(String[] rad, int line) throws CsvNullValueException, CsvWrongDataTypeException {
        for (int i = 0; i < 5; i++) {
            if ("".equals(rad[i])) {
                throw new CsvNullValueException(line);
            }
        }
        if (
                !(csvValidering.validerInput(rad[0]) &&
                csvValidering.validerInput(rad[1]) &&
                csvValidering.validerInput(rad[2]) &&
                csvValidering.validerInput(rad[3]) &&
                csvValidering.validerDouble(rad[4]))
        ) {
            throw new CsvWrongDataTypeException(line);
        }
    }

    public void tomFil(File file) throws Exception {
        if (file.length() == 0) {
            throw new Exception("Filen er tom.");
        }
    }
}
