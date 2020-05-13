package org.openjfx.models.avvik;

public class CsvWrongSeparatorException extends Exception {
    public CsvWrongSeparatorException(int line) {
        super("Oppdaget feil separator i csv fil på linje " + line);
    }
}
