package models.objects;

import java.io.Serializable;

public class Tastatur implements Serializable {
    private String tastaturNavn;
    private double pris;

    public Tastatur(String tastaturNavn, double pris) {
        this.tastaturNavn = tastaturNavn;
        this.pris = pris;
    }

    public String getTastaturNavn() {
        return tastaturNavn;
    }

    public double getPris() {
        return pris;
    }
}
