package models;

import java.io.Serializable;

public class Ram implements Serializable {
    private RamNavn ramNavn;
    private RamStørrelse ramStørrelse;
    private Pris pris;

    public Ram(RamNavn ramNavn, RamStørrelse ramStørrelse, Pris pris) {
        this.ramNavn = ramNavn;
        this.ramStørrelse = ramStørrelse;
        this.pris = pris;
    }

    public RamNavn getRamNavn() {
        return ramNavn;
    }

    public RamStørrelse getRamStørrelse() {
        return ramStørrelse;
    }

    public Pris getPris() {
        return pris;
    }
}
