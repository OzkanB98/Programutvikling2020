package org.openjfx.models;

import com.opencsv.bean.CsvBindByName;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;

public class BeansKomponent {
    private static final long serialVersionUID = -3374056834004694159L;

    @CsvBindByName(column = "merke")
    private SimpleStringProperty merke;
    @CsvBindByName(column = "type")
    private SimpleStringProperty type;
    @CsvBindByName(column = "produktKategori")
    private SimpleStringProperty produktKategori;
    @CsvBindByName(column = "produktDetaljer")
    private SimpleStringProperty produktDetaljer;
    @CsvBindByName(column = "pris")
    private SimpleDoubleProperty pris;

    public BeansKomponent(String merke, String type, String produktKategori, String produktDetaljer, Double pris) {
        this.merke = new SimpleStringProperty(merke);
        this.type = new SimpleStringProperty(type);
        this.produktKategori = new SimpleStringProperty(produktKategori);
        this.produktDetaljer = new SimpleStringProperty(produktDetaljer);
        this.pris = new SimpleDoubleProperty(pris);
    }

    public String getMerke() { return merke.get(); }

    public void setMerke(String merke) { this.merke.set(merke); }

    public String getType() { return type.get(); }

    public void setType(String type) { this.type.set(type); }

    public String getProduktKategori() { return produktKategori.get(); }

    public void setProduktKategori(String produktKategori) { this.produktKategori.set(produktKategori); }

    public String getProduktDetaljer() { return produktDetaljer.get(); }

    public void setProduktDetaljer(String produktDetaljer) { this.produktDetaljer.set(produktDetaljer); }

    public Double getPris() { return pris.get(); }

    public void setPris(Double pris) { this.pris.set(pris); }
}
