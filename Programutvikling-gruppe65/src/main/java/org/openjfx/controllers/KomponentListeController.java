package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.openjfx.App;
import org.openjfx.models.Komponent;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class KomponentListeController implements Initializable {

    @FXML private TableColumn merkeKolonne;
    @FXML private TableColumn typeKolonne;
    @FXML private TableColumn kategoriKolonne;
    @FXML private TableColumn detaljerKolonne;
    @FXML private TableColumn prisKolonne;

    @FXML
    private void handleAvbryt(ActionEvent event) throws IOException {
        App.setRoot("komponentMeny");
    }

    @FXML
    private TableView<Komponent> komponentlisteTableView;

    private ObservableList<Komponent> list = FXCollections.observableArrayList();

    public void attachTableView(TableView tv) {
        tv.setItems(list);
    }

    public void addElement(Komponent obj) {
        list.add(obj);
    }

    @Override
    public void initialize(URL url, ResourceBundle RB) {
        merkeKolonne.setCellValueFactory(new PropertyValueFactory("merke"));
        typeKolonne.setCellValueFactory(new PropertyValueFactory("type"));
        kategoriKolonne.setCellValueFactory(new PropertyValueFactory("kategori"));
        detaljerKolonne.setCellValueFactory(new PropertyValueFactory("detaljer"));
        prisKolonne.setCellValueFactory(new PropertyValueFactory("pris"));
    }

    public static List<Komponent> readJOBJ(String filepath) {

        List<Komponent> dataList = FXCollections.observableArrayList();
        String delimiter = ";";

        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(filepath));

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter, -1);

                Komponent komponent = new Komponent(fields[0], fields[1], fields[2], fields[3], parseDouble(fields[4]));
                dataList.add(komponent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    @FXML
    public void readJOBJ(ActionEvent event) {

        komponentlisteTableView.getItems().setAll(readJOBJ("Komponenter.jobj"));
    }


}
