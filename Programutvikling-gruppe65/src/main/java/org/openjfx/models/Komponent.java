package org.openjfx.models;

import java.io.Serializable;

public class Komponent extends TilLagring {
    private String merke;
    private String type;
    private String produktKategori;
    private String produktDetaljer;
    private Double pris;

    public Komponent(String merke, String type, String produktKategori, String produktDetaljer, Double pris) {
        this.merke = merke;
        this.type = type;
        this.produktKategori = produktKategori;
        this.produktDetaljer = produktDetaljer;
        this.pris = pris;
    }

    public String getMerke() { return merke; }

    public void setMerke(String merke) { this.merke = merke; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getProduktKategori() { return produktKategori; }

    public void setProduktKategori(String produktKategori) { this.produktKategori = produktKategori; }

    public String getProduktDetaljer() { return produktDetaljer; }

    public void setProduktDetaljer(String produktDetaljer) { this.produktDetaljer = produktDetaljer; }

    public Double getPris() { return pris; }

    public void setPris(Double pris) { this.pris = pris; }
}
