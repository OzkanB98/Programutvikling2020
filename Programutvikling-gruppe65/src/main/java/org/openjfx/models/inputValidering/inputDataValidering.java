package org.openjfx.models.inputValidering;

import java.util.zip.DataFormatException;

public class inputDataValidering {

    public void tomtInputFelt(String input) throws NullPointerException {
        input = input.trim();
        if (!(input.length() > 0)) {
            throw new NullPointerException("Alle tekstfelt må fylles ut!");
        }
    }

    public String validerTekstFelt(String input, String tekstFelt) throws NullPointerException, IllegalArgumentException {
        tomtInputFelt(input);
        input = input.trim();
        input = forLangTekst(input, tekstFelt);

        if (!input.matches("[0-9a-zA-ZäöæøåÄÖÆØÅ]+")) {
            throw new IllegalArgumentException("Feil format i tekstfeltet for " + tekstFelt + "vennligst bruk bokstaver i det norske alfabetet og tall mellom 0 til 9.");
        }
        return input;
    }


    public String forLangTekst(String input, String tekstFelt) throws NullPointerException, IllegalArgumentException {

        if (input.length() < 30) {
            throw new IllegalArgumentException("Vennligst skriv et kortere navn i tekstfeltet for " + tekstFelt);
        }
    }



            public void validerPris (String input, String tekstFelt) throws NullPointerException, DataFormatException {
                tomtInputFelt(input);
                input = input.trim();

                if (!input.matches("[0-9]+(.){0,1}[0-9]+]") || !input.matches("[0-9]+")) {
                    throw new DataFormatException("Pris må skrives i enten heltall eller desimalformat.");
                }
            }

            public String validerKategoriVelger(String input) throws IllegalArgumentException {
                if (input.equals("Velg kategori")) {
                    throw new IllegalArgumentException("Vennligst velg en produktkategori");
                }
                return input;
            }
        

}
