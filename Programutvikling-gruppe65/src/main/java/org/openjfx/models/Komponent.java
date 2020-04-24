package org.openjfx.models;

public abstract class Komponent {
    private String merke;
    private String modell;
    private double pris;

    public Komponent(String merke, String modell, double pris) {
        this.merke = merke;
        this.modell = modell;
        this.pris = pris;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
