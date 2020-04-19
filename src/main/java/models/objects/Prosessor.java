package models.objects;

import java.io.Serializable;

public class Prosessor implements Serializable {
    private String prosessorNavn;
    private double pris;

    public Prosessor(String prosessorNavn, double pris) {
        this.prosessorNavn = prosessorNavn;
        this.pris = pris;
    }

    public String getProsessorNavn() {
        return prosessorNavn;
    }

    public double getPris() {
        return pris;
    }
}
