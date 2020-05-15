package org.openjfx.models;

import com.opencsv.bean.CsvBindByName;
import javafx.scene.control.TableColumn;

import java.io.Serializable;
import java.util.ArrayList;

public class Komponent extends TilLagring implements Serializable {
    private static final long serialVersionUID = -3374056834004694159L;

    @CsvBindByName(column = "merke")
    private String merke;
    @CsvBindByName(column = "type")
    private String type;
    @CsvBindByName(column = "produktKategori")
    private String produktKategori;
    @CsvBindByName(column = "produktDetaljer")
    private String produktDetaljer;
    @CsvBindByName(column = "pris")
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

    public String toString() {
        return String.format("Produktinformasjon: \n" +
                "Merke: %s \n" +
                "Type: %s \n" +
                "Produktkategori: %s \n" +
                "Produktdetaljer: %s \n" +
                "Pris: %s \n",
                merke, type, produktKategori, produktDetaljer, pris);
    }

    public boolean hovedkortKategori() {
        return this.produktKategori.equals("Hovedkort");
    }


}
