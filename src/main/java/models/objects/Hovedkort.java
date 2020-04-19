package models.objects;

import java.io.Serializable;

public class Hovedkort implements Serializable {
    private String hovedkortNavn;
    private double hovedkortPris;

    public Hovedkort(String hovedkortNavn, double hovedkortPris) {
        this.hovedkortNavn = hovedkortNavn;
        this.hovedkortPris = hovedkortPris;
    }

    public String getHovedkortNavn() {
        return hovedkortNavn;
    }

    public double getHovedkortPris() {
        return hovedkortPris;
    }
}
