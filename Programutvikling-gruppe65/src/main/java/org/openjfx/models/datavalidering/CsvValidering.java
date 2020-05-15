package org.openjfx.models.datavalidering;

public class CsvValidering {
    public boolean validerInput(String input) {
        char[] charArray = input.toCharArray();
        for (char character : charArray) {
            if(!Character.isLetterOrDigit(character) && !Character.isSpaceChar(character) && !(character == '-')) {
                return false;
            }
        }
        return true;
    }

    public boolean validerDouble(String input) {
        char[] charArray = input.toCharArray();
        for (char character : charArray) {
            if (!Character.isDigit(character)) {
                return false;
            }
        }
        return true;
    }

}
