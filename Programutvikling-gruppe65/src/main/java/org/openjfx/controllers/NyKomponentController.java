package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.ArrayList;

public class NyKomponentController {

    private ObservableList<String> kategorier = FXCollections.observableArrayList("Velg kategori", "Hovedkort", "Skjermkort", "Prosessor", "Minne", "Lagring", "Strømforsyning","Kjøling", "Kabinett", "Tastatur", "Mus", "Skjerm");


    @FXML
    private ChoiceBox kategori;

    @FXML
    private void initialize(){
        kategori.setValue("Velg kategori");
        kategori.setItems(kategorier);
    }


}
