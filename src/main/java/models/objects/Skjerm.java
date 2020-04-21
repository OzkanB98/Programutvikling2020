package models.objects;

import java.io.Serializable;

public class Skjerm implements Serializable {
    private String skjermNavn;
    private double pris;

    public Skjerm(String skjermNavn, double pris) {
        this.skjermNavn = skjermNavn;
        this.pris = pris;
    }

    public String getSkjermNavn() {
        return skjermNavn;
    }

    public double getPris() {
        return pris;
    }
}