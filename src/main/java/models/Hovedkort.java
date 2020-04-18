package models;

import java.io.Serializable;

public class Hovedkort implements Serializable {
    private HovedkortNavn hovedkortNavn;
    private HovedkortPris hovedkortPris;

    public Hovedkort(HovedkortNavn hovedkortNavn, HovedkortPris hovedkortPris) {
        this.hovedkortNavn = hovedkortNavn;
        this.hovedkortPris = hovedkortPris;
    }

    public HovedkortNavn getHovedkortNavn() {
        return hovedkortNavn;
    }

    public HovedkortPris getHovedkortPris() {
        return hovedkortPris;
    }
}
