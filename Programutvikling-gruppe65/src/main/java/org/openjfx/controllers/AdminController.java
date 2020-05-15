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
import org.openjfx.models.BeansKomponent;
import org.openjfx.models.Komponent;
import org.openjfx.models.LastKomponenterTask;
import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AdminController {

    private TilLagring komponenter;
    private KomponentTableViewHandler handler;
    private ObservableList<BeansKomponent> liste;
    private Task<Void> task;
    private ExecutorService es;

    @FXML
    private TableView<BeansKomponent> komponentTableView;

    @FXML
    private TableColumn<BeansKomponent, String> merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne;

    @FXML
    private TableColumn<BeansKomponent, Double> prisKolonne;


    @FXML
    public void initialize(){


        Task<Void> execute = this.lastInnKomponenter();

        es = Executors.newFixedThreadPool(3);
        es.submit(execute);
        komponentTableView.refresh();
        System.out.println("admincontroller initialisert");

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

    @FXML
    private Task<Void> lastInnKomponenter(){
        File fil = new File("Komponenter.jobj");
        komponenter = new TilLagring();
        task = new LastKomponenterTask(fil, komponenter, () -> {

            liste = FXCollections.observableArrayList(konverterTilBeans(komponenter.getKomponentArrayList()));
            handler = new KomponentTableViewHandler(komponentTableView, merkeKolonne, typeKolonne, kategoriKolonne, detaljerKolonne, prisKolonne, liste);
            System.out.println(komponenter.getKomponentArrayList());
            handler.attachTableView(komponentTableView);
            System.out.println("Task utført");
            komponentTableView.refresh();
        });

        System.out.println("Lastet inn komponenter fra admin controller");
        return task;
    }

    private List<BeansKomponent> konverterTilBeans(List<Komponent> komponenter){
        List<BeansKomponent> beansList = new ArrayList<>();
        for(Komponent k : komponenter){
            BeansKomponent nyBeansKomponent = new BeansKomponent(k.getMerke(), k.getType(), k.getProduktKategori(), k.getProduktDetaljer(), k.getPris());
            beansList.add(nyBeansKomponent);
        }
        return beansList;
    }


}
