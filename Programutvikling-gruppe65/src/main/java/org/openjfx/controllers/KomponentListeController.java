package org.openjfx.controllers;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
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
import org.openjfx.models.TilLagring;
import org.openjfx.models.filbehandling.CSVLeser;
import org.openjfx.models.filbehandling.JOBJLeser;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class KomponentListeController implements Initializable {

    private static final String komponenterPathJOBJ = "Komponenter.jobj";
    private static final String komponenterPathCSV = "Komponenter.csv";

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
            komponentlisteTableView.getItems().setAll(readCSV());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Komponent> readCSV() throws Exception {
        ObservableList<Komponent> dataList = FXCollections.observableArrayList();

        CSVParser csvParser = new CSVParserBuilder()
                .withSeparator(';')
                .withIgnoreQuotations(true)
                .build();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader(komponenterPathCSV))
                .withCSVParser(csvParser)
                .withSkipLines(0)
                .build();
        int lineNumber = 0;
        String[] rad;
            while ((rad = csvReader.readNext()) != null) {
            lineNumber++;
            Komponent komponent = new Komponent(rad[0], rad[1], rad[2], rad[3], Double.valueOf(rad[4]));
            dataList.add(komponent);
        }
            return dataList;
    }

    /*
    public ObservableList<Komponent> readJOBJ() throws Exception {
        ObservableList<Komponent> dataList = FXCollections.observableArrayList();
        try {
            TilLagring tilLagring = new TilLagring();
            JOBJLeser jobjLeser = new JOBJLeser();
            jobjLeser.lesFraFil(new File(komponenterPathJOBJ), tilLagring);
            BufferedReader br = new BufferedReader(new FileReader(komponenterPathJOBJ));

            int lineNumber = 0;
            String line;
            while((line = br.readLine()) != null) {
                lineNumber++;
                String[] fields = line.split(";");
                Komponent komponent = new Komponent((fields[0]), fields[1], fields[2], fields[3], Double.valueOf(fields[4]));
                dataList.add(komponent);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return dataList;
    }

     */


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
