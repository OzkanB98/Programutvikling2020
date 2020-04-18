package models;

import java.io.Serializable;

public class Skjerm implements Serializable {
    private SkjermNavn skjermNavn;
    private Pris pris;

    public Skjerm(SkjermNavn skjermNavn, Pris pris) {
        this.skjermNavn = skjermNavn;
        this.pris = pris;
    }

    public SkjermNavn getSkjermNavn() {
        return skjermNavn;
    }

    public Pris getPris() {
        return pris;
    }
}