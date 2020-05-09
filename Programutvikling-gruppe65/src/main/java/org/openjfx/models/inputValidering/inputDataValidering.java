package org.openjfx.models.inputValidering;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class inputDataValidering {

    public void tomtInputFelt(String input) throws NullPointerException {
        input = input.trim();
        if (!(input.length() > 0)) {
            throw new NullPointerException("Alle tekstfelt må fylles ut!");
        }
    }

    public String sjekkInputFelt(String input, String tekstFelt) throws NullPointerException, DataFormatException {
        tomtInputFelt(input);
        input = input.trim();

        char[] charArray = input.toCharArray();
        for (char character : charArray) {
            if(!Character.isLetterOrDigit(character) &&
                    !Character.isSpaceChar(character)) {
                throw new DataFormatException("Feil inntastet data i tekstfeltet, kan bare være " + tekstFelt);
            }
        }
        return input;
    }

    public String validerKategoriVelger(String input) throws IllegalArgumentException{
        if(input.equals("Velg kategori")){
            throw new IllegalArgumentException("Vennligst velg en produktkategori");
        }
        return input;
    }


}
