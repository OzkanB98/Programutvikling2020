package models;

import java.io.Serializable;

public class Skjermkort implements Serializable {
    private SkjermkortNavn skjermkortNavn;
    private Pris pris;

    public Skjermkort(SkjermkortNavn skjermkortNavn, Pris pris) {
        this.skjermkortNavn = skjermkortNavn;
        this.pris = pris;
    }

    public SkjermkortNavn getSkjermkortNavn() {
        return skjermkortNavn;
    }

    public Pris getPris() {
        return pris;
    }
}
