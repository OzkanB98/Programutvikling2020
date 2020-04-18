package models;

import java.io.Serializable;

public class Harddisk implements Serializable {
    private HarddiskNavn harddiskNavn;
    private HarddiskStørrelse harddiskStørrelse;
    private Pris pris;

    public Harddisk(HarddiskNavn harddiskNavn, HarddiskStørrelse harddiskStørrelse, Pris pris) {
        this.harddiskNavn = harddiskNavn;
        this.harddiskStørrelse = harddiskStørrelse;
        this.pris = pris;
    }

    public HarddiskNavn getHarddiskNavn() {
        return harddiskNavn;
    }

    public HarddiskStørrelse getHarddiskStørrelse() {
        return harddiskStørrelse;
    }

    public Pris getPris() {
        return pris;
    }
}
