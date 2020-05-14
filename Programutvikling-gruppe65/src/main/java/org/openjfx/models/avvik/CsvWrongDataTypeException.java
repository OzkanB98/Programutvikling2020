package org.openjfx.models.avvik;

public class CsvWrongDataTypeException extends Exception {
    public CsvWrongDataTypeException(int line) {
        super("Oppdaget feil datatype i csv fil på linje " + line);
    }
}
