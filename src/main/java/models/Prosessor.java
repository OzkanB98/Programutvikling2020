package models;

import java.io.Serializable;

public class Prosessor implements Serializable {
    private ProsessorNavn prosessorNavn;
    private Pris pris;

    public Prosessor(ProsessorNavn prosessorNavn, Pris pris) {
        this.prosessorNavn = prosessorNavn;
        this.pris = pris;
    }

    public ProsessorNavn getProsessorNavn() {
        return prosessorNavn;
    }

    public Pris getPris() {
        return pris;
    }
}
