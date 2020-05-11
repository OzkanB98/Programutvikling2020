package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.openjfx.models.Komponent;
import org.openjfx.models.datavalidering.InputDataValidering;
import org.openjfx.models.filbehandling.JOBJSkriver;
import org.openjfx.models.filbehandling.Skriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class NyKomponentController {

    private Skriver filskriver;
    private ObservableList<String> kategorier = FXCollections.observableArrayList("Velg kategori", "Hovedkort", "Skjermkort", "Prosessor", "Minne", "Lagring", "Strømforsyning","Kjøling", "Kabinett", "Tastatur", "Mus", "Skjerm");
    private InputDataValidering dataValidering;

    @FXML
    private TextField merkeTekstFelt;
    @FXML
    private TextField typeTekstFelt;
    @FXML
    private TextField prisTekstFelt;
    @FXML
    private TextArea detaljerTekstFelt;
    @FXML
    private ChoiceBox kategori;


    @FXML
    private void initialize(){
        kategori.setValue("Velg kategori");
        kategori.setItems(kategorier);


    }

    @FXML
    private void leggTilKomponent(Event event) throws IOException, NumberFormatException{

        try {
            String merke = merkeTekstFelt.getText();
            String type = typeTekstFelt.getText();
            Double pris = Double.parseDouble(prisTekstFelt.getText());
            String detaljer = detaljerTekstFelt.getText();
            String kat = kategori.getValue().toString();

            Komponent komponent = new Komponent(merke, type, kat, detaljer, pris);
            File fil = new File("/Programutvikling-gruppe65/testfiler/Komponenter.jobj");
            filskriver = new JOBJSkriver();
            filskriver.skrivTilFil(fil, sjekkInput(komponent));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Komponent sjekkInput(Komponent k) throws DataFormatException {
        dataValidering.validerTekstFelt(k.getMerke(), "Merke");
        dataValidering.validerTekstFelt(k.getType(), "Type");
        dataValidering.validerKategoriVelger(k.getProduktKategori());
        dataValidering.validerPris(k.getPris().toString());

        return k;
    }


}
