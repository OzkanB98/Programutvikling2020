package models.objects;

import java.io.Serializable;

public class Mus implements Serializable {
    private String musNavn;
    private double pris;

    public Mus(String musNavn, double pris) {
        this.musNavn = musNavn;
        this.pris = pris;
    }

    public String getMusNavn() {
        return musNavn;
    }

    public double getPris() {
        return pris;
    }
}
