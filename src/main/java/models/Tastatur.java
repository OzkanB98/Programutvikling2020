package models;

import java.io.Serializable;

public class Tastatur implements Serializable {
    private TastaturNavn tastaturNavn;
    private Pris pris;

    public Tastatur(TastaturNavn tastaturNavn, Pris pris) {
        this.tastaturNavn = tastaturNavn;
        this.pris = pris;
    }

    public TastaturNavn getTastaturNavn() {
        return tastaturNavn;
    }

    public Pris getPris() {
        return pris;
    }
}
