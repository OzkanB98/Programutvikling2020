package org.openjfx.models;

import java.io.Serializable;

public class Komponent extends TilLagring implements Serializable {
    private String merke;
    private String type;
    private Double pris;
    private String produktKategori;
    private String produktDetaljer;

    public Komponent(String merke, String type, Double pris, String produktKategori, String produktDetaljer) {
        this.merke = merke;
        this.type = type;
        this.pris = pris;
        this.produktKategori = produktKategori;
        this.produktDetaljer = produktDetaljer;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPris() {
        return pris;
    }

    public void setPris(Double pris) {
        this.pris = pris;
    }

    public String getProduktKategori() {
        return produktKategori;
    }

    public void setProduktKategori(String produktKategori) {
        this.produktKategori = produktKategori;
    }

    public String getProduktDetaljer() {
        return produktDetaljer;
    }

    public void setProduktDetaljer(String produktDetaljer) {
        this.produktDetaljer = produktDetaljer;
    }
}
