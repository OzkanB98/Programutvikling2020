package org.openjfx.models.filbehandling;

import com.opencsv.bean.*;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVSkriver implements Skriver {

    @Override
    public void skrivTilFil(File file, TilLagring obj) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        List<Komponent> komponentList = obj.getKomponentArrayList();
        //CSVWriter writer = new CSVWriter(new FileWriter(file));
        FileWriter writer = new FileWriter(file);
        ColumnPositionMappingStrategy<Komponent> strategy = new ColumnPositionMappingStrategy<>();
        String[] kolonner = {"merke","type","produktKategori","produktDetaljer","pris"};
        strategy.setType(Komponent.class);
        strategy.setColumnMapping(kolonner);
        StatefulBeanToCsvBuilder<Komponent> statefulBeanToCsvBuilder = new StatefulBeanToCsvBuilder<Komponent>(writer)
                .withSeparator(';')
                .withMappingStrategy(strategy);

        StatefulBeanToCsv<Komponent> statefulBeanToCsv = statefulBeanToCsvBuilder.build();
        statefulBeanToCsv.write(komponentList);
        writer.close();

    }
}
