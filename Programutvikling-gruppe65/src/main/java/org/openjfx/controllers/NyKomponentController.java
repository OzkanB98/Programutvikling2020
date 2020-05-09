package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class NyKomponentController {

    private ObservableList<String> kategorier = FXCollections.observableArrayList("Velg kategori", "Hovedkort", "Skjermkort", "Prosessor", "Minne", "Lagring", "Strømforsyning","Kjøling", "Kabinett", "Tastatur", "Mus", "Skjerm");

    @FXML
    private TextField merkeTekstFelt;
    @FXML
    private TextField typeTekstFelt;
    @FXML
    private TextField prisTekstFelt;
    @FXML
    private TextArea produktTekstFelt;
    @FXML
    private ChoiceBox kategori;

    @FXML
    private void initialize(){
        kategori.setValue("Velg kategori");
        kategori.setItems(kategorier);
    }


}
