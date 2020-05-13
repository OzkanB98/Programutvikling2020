package org.openjfx.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.openjfx.App;
import org.openjfx.models.Komponent;
import org.openjfx.models.Komponenter;
import org.openjfx.models.LastKomponenterTask;
import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class AdminController {

    private TilLagring komponenter;
    private Komponent komponent;
    private KomponentTableViewHandler handler;
    private ObservableList<Komponent> liste;
    private Task<Void> task;
    private ExecutorService es;

    @FXML
    private TableView<Komponent> komponentTableView;

    @FXML
    private TableColumn<Komponent, String> merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne;

    @FXML
    private TableColumn<Komponent, Double> prisKolonne;


    public void initialize(){
        komponenter = new TilLagring();
        es = Executors.newSingleThreadExecutor();
        es.submit(this::lastInnKomponenter);

    }

    @FXML
    private void tilbakeKnapp(ActionEvent event) throws IOException {
        App.setRoot("startside");
    }

    @FXML
    private void leggTilKnapp(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/org/openjfx/nyKomponent.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    private Task<Void> lastInnKomponenter(){
        File fil = new File("Komponenter1.jobj");
        task = new LastKomponenterTask(fil, komponenter, () -> {
            liste = FXCollections.observableArrayList(komponenter.getKomponentArrayList());
            handler = new KomponentTableViewHandler(komponentTableView, merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne, prisKolonne);
            handler.attachTableView(liste);
        });
        return task;
    }


}
