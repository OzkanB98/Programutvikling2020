package models.objects;

import java.io.Serializable;

public class Harddisk implements Serializable {
    private String harddiskNavn;
    private String harddiskStørrelse;
    private double pris;

    public Harddisk(String harddiskNavn, String harddiskStørrelse, double pris) {
        this.harddiskNavn = harddiskNavn;
        this.harddiskStørrelse = harddiskStørrelse;
        this.pris = pris;
    }

    public String getHarddiskNavn() {
        return harddiskNavn;
    }

    public String getHarddiskStørrelse() {
        return harddiskStørrelse;
    }

    public double getPris() {
        return pris;
    }
}
