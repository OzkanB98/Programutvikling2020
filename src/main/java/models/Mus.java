package models;

import java.io.Serializable;

public class Mus implements Serializable {
    private MusNavn musNavn;
    private Pris pris;

    public Mus(MusNavn musNavn, Pris pris) {
        this.musNavn = musNavn;
        this.pris = pris;
    }

    public MusNavn getMusNavn() {
        return musNavn;
    }

    public Pris getPris() {
        return pris;
    }
}
