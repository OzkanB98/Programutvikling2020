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
import org.openjfx.models.BeansKomponent;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;
import org.openjfx.models.filbehandling.CSVLeser;
import org.openjfx.models.filbehandling.JOBJLeser;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class KomponentListeController implements Initializable {

    @FXML private TableView<Komponent> komponentlisteTableView;
    @FXML private TableColumn<Komponent, String> merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne;
    @FXML private TableColumn<Komponent, Double> prisKolonne;

    @FXML
    private void handleAvbryt(ActionEvent event) throws IOException {
        App.setRoot("komponentMeny");
    }

    @Override
    public void initialize(URL url, ResourceBundle RB) {

        merkeKolonne.setCellValueFactory(new PropertyValueFactory<>("merke"));
        typeKolonne.setCellValueFactory(new PropertyValueFactory<>("type"));
        kategoriKolonne.setCellValueFactory(new PropertyValueFactory<>("produktKategori"));
        detaljerKolonne.setCellValueFactory(new PropertyValueFactory<>("produktDetaljer"));
        prisKolonne.setCellValueFactory(new PropertyValueFactory<>("pris"));

        try {
            komponentlisteTableView.getItems().setAll(readJOBJ3());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Komponent> readJOBJ(String filepath) {
        ObservableList<Komponent> dataList = FXCollections.observableArrayList();

        try {
            FileInputStream fileInputStream = new FileInputStream(filepath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            dataList = (ObservableList<Komponent>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    public ObservableList<Komponent> readJOBJ2(String filepath) {
        ObservableList<Komponent> dataList = FXCollections.observableArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(komponenterPath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                JOBJLeser jobjLeser = new JOBJLeser();

                Komponent komponent = new Komponent((fields[0]), fields[1], fields[2], fields[3], parseDouble(fields[4]));
                dataList.add(komponent);
                jobjLeser.lesFraFil(new File("Komponenter.jobj"), komponent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }

    private static final String komponenterPath = "Komponenter.jobj";

    public ObservableList<Komponent> readJOBJ3() throws Exception {
        ObservableList<Komponent> dataList = FXCollections.observableArrayList();
        TilLagring tilLagring = new TilLagring();
        JOBJLeser jobjLeser = new JOBJLeser();
        jobjLeser.lesFraFil(new File(komponenterPath), tilLagring);
        try {
            Komponent komponent = new Komponent(merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne, prisKolonne);
            dataList.add(komponent);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return dataList;
    }

    /*
    @FXML
    public void readJOBJ(ActionEvent event) {
        komponentlisteTableView.getItems().setAll(readJOBJ("Komponenter.jobj"));
    }
*/
/*
    public void attachTableView(ObservableList<Komponent> list){
        komponentlisteTableView.setItems(list);
    }
 */
}
