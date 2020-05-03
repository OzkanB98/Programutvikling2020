package org.openjfx.models;

public abstract class Komponent {
    private String merke;
    private String type;
    private double pris;

    public Komponent(String merke, String type, double pris) {
        this.merke = merke;
        this.type = type;
        this.pris = pris;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return type;
    }

    public void setModell(String modell) {
        this.type = modell;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
