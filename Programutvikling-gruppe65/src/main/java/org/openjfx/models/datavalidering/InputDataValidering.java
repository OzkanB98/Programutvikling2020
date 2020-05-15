package org.openjfx.models.datavalidering;

import java.util.zip.DataFormatException;

public class InputDataValidering {

    private void tomtInputFelt(String input) throws NullPointerException {
        input = input.trim();
        if (!(input.length() > 0)) {
            throw new NullPointerException("Alle tekstfelt må fylles ut!");
        }
    }

    public String validerTekstFelt(String input, String tekstFelt) throws NullPointerException, IllegalArgumentException {
        tomtInputFelt(input);
        input = input.trim();
        input = forLangTekst(input, tekstFelt);

        if (!input.matches("[0-9a-zA-ZäöæøåÄÖÆØÅ ]+")) {
            throw new IllegalArgumentException("Feil format i tekstfeltet for " + tekstFelt + "vennligst bruk bokstaver i det norske alfabetet og tall mellom 0 til 9.");
        }
        return input;
    }

    public String forLangTekst(String input, String tekstFelt) throws NullPointerException, IllegalArgumentException {

        if (input.length() > 30) {
            throw new IllegalArgumentException("Vennligst skriv et kortere navn i tekstfeltet for " + tekstFelt);
        }
        return input;
    }

    public String validerPris(String input) throws NullPointerException, DataFormatException {
        tomtInputFelt(input);
        input = input.trim();



        return input;
    }

    public String validerKategoriVelger(String input) throws IllegalArgumentException {
        if (input.equals("Velg kategori")) {
            throw new IllegalArgumentException("Vennligst velg en produktkategori");
        }
        return input;
    }

}