package org.openjfx.models.inputValidering;

public class RegexValidator {

    public static String gyldigMerkeOgTypeRegex = "^([0-9a-zA-ZäöæøåøÄÖÆØÅ ]{3, 25})?$";
    public static String ugyldigMerkeOgTypeMelding = "Ugyldige tegn er brukt i merke eller type tekstfeltene.";

    public static String gyldigPrisRegex = "^[0-9]+(.|,)?[0-9]?$";
    public static String ugyldigPrisMelding = "Vennligst bruk tall i prisfeltet.";

    public static String tomtInputRegex = "^$|pattern";
    public static String tomtInputMelding = "Alle tekstfelt på fylles ut!";

    public static String getGyldigMerkeOgTypeRegex() {
        return gyldigMerkeOgTypeRegex;
    }

    public static void setGyldigMerkeOgTypeRegex(String gyldigMerkeOgTypeRegex) {
        RegexValidator.gyldigMerkeOgTypeRegex = gyldigMerkeOgTypeRegex;
    }

    public static String getUgyldigMerkeOgTypeMelding() {
        return ugyldigMerkeOgTypeMelding;
    }

    public static void setUgyldigMerkeOgTypeMelding(String ugyldigMerkeOgTypeMelding) {
        RegexValidator.ugyldigMerkeOgTypeMelding = ugyldigMerkeOgTypeMelding;
    }

    public static String getGyldigPrisRegex() {
        return gyldigPrisRegex;
    }

    public static void setGyldigPrisRegex(String gyldigPrisRegex) {
        RegexValidator.gyldigPrisRegex = gyldigPrisRegex;
    }

    public static String getUgyldigPrisMelding() {
        return ugyldigPrisMelding;
    }

    public static void setUgyldigPrisMelding(String ugyldigPrisMelding) {
        RegexValidator.ugyldigPrisMelding = ugyldigPrisMelding;
    }

    public static String getTomtInputRegex() {
        return tomtInputRegex;
    }

    public static void setTomtInputRegex(String tomtInputRegex) {
        RegexValidator.tomtInputRegex = tomtInputRegex;
    }

    public static String getTomtInputMelding() {
        return tomtInputMelding;
    }

    public static void setTomtInputMelding(String tomtInputMelding) {
        RegexValidator.tomtInputMelding = tomtInputMelding;
    }
}
