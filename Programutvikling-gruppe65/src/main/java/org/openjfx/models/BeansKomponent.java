package org.openjfx.models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class BeansKomponent {

    private SimpleStringProperty merke;
    private SimpleStringProperty type;
    private SimpleStringProperty produktKategori;
    private SimpleStringProperty produktDetaljer;
    private SimpleDoubleProperty pris;

    public BeansKomponent(String merke, String type, String produktKategori, String produktDetaljer, Double pris) {
        this.merke = new SimpleStringProperty(merke);
        this.type = new SimpleStringProperty(type);
        this.produktKategori = new SimpleStringProperty(produktKategori);
        this.produktDetaljer = new SimpleStringProperty(produktDetaljer);
        this.pris = new SimpleDoubleProperty(pris);
    }

    public String getMerke() {
        return merke.getValue();
    }

    public void setMerke(String merke) {
        this.merke.set(merke);
    }

    public String getType() {
        return type.getValue();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getProduktKategori() {
        return produktKategori.getValue();
    }

    public void setProduktKategori(String produktKategori) {
        this.produktKategori.set(produktKategori);
    }

    public String getProduktDetaljer() {
        return produktDetaljer.getValue();
    }

    public void setProduktDetaljer(String produktDetaljer) {
        this.produktDetaljer.set(produktDetaljer);
    }

    public Double getPris() {
        return pris.getValue();
    }

    public void setPris(Double pris) {
        this.pris.set(pris);
    }
}
