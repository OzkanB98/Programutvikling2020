package org.openjfx.models.avvik;

public class CsvNullValueException extends Exception {
    public CsvNullValueException(int line) {
        super("Oppdaget null verdi i csv fil på linje " + line);
    }
}
