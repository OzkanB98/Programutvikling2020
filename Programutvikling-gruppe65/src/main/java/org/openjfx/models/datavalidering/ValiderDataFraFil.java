package org.openjfx.models.datavalidering;

import org.openjfx.models.Komponent;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ValiderDataFraFil {

    public List<Komponent> read(String path) throws IOException {
        ArrayList<Komponent> liste = new ArrayList<>();

        try (BufferedReader lesFil = Files.newBufferedReader(Paths.get(path))) {
            String line;

            while((line=lesFil.readLine()) != null) {
                liste.add(parseKomponent(line));
            }
        }
        return liste;
    }

    private Komponent parseKomponent(String line) throws InvalidKomponentFormatException {
        String[] split = line.split(";");
        if(split.length != 3) {
            throw new InvalidKomponentFormatException("Må bruke semicolon for å skille mellom dataverdier.");
        }

        String merke = split[0];
        String type = split[1];
        String produktKategori = split[2];
        String produktDetaljer = split[3];
        Double pris = parseNumber(split[4], "Pris er ikke oppgitt i riktig format.");

        return new Komponent(merke, type, produktKategori, produktDetaljer, pris);
    }

    private double parseNumber(String str, String errorMessage) throws InvalidKomponentFormatException {
        double number;
        try {
            number = Double.parseDouble(str);
        } catch (NumberFormatException e){
            throw new InvalidKomponentFormatException(errorMessage);
        }
        return number;
    }
}
