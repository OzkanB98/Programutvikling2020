package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openjfx.App;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;

import java.io.File;
import java.io.IOException;

public class AdminController {

    private TilLagring komponenter;
    private Komponent komponent;

    public void initialize(){
        lastInnKomponenter();
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

    private void lastInnKomponenter(){
        File fil = new File("Komponenter.jobj");

    }


}
