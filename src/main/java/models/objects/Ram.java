package models.objects;

import java.io.Serializable;

public class Ram implements Serializable {
    private String ramNavn;
    private String ramStørrelse;
    private double pris;

    public Ram(String ramNavn, String ramStørrelse, double pris) {
        this.ramNavn = ramNavn;
        this.ramStørrelse = ramStørrelse;
        this.pris = pris;
    }

    public String getRamNavn() {
        return ramNavn;
    }

    public String getRamStørrelse() {
        return ramStørrelse;
    }

    public double getPris() {
        return pris;
    }
}
