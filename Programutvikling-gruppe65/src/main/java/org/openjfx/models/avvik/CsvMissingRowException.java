package org.openjfx.models.avvik;

public class CsvMissingRowException extends Exception {
    public CsvMissingRowException(int line) {
        super("Oppdaget feil antall rader i csv fil på linje " + line);
    }
}
