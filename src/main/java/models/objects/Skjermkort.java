package models.objects;

import java.io.Serializable;

public class Skjermkort implements Serializable {
    private String skjermkortNavn;
    private double pris;

    public Skjermkort(String skjermkortNavn, double pris) {
        this.skjermkortNavn = skjermkortNavn;
        this.pris = pris;
    }

    public String getSkjermkortNavn() {
        return skjermkortNavn;
    }

    public double getPris() {
        return pris;
    }
}
