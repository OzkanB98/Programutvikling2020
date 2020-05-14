package org.openjfx.models.avvik;

public class CsvWrongTextFormatException extends Exception {
    public CsvWrongTextFormatException(int line) {
        super("Oppdaget feil tekstformat i csv fil på rad " + line);
    }
}
