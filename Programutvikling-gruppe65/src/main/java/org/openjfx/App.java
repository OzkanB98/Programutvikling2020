package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.openjfx.models.Komponent;
import org.openjfx.models.datavalidering.InvalidKomponentFormatException;
import org.openjfx.models.datavalidering.ValiderDataFraFil;
import org.openjfx.models.filbehandling.JOBJSkriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("startside"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();

        ValiderDataFraFil lesFraFil = new ValiderDataFraFil();

        try {
            List<Komponent> komponentList = lesFraFil.read("Filnavn.csv");
            System.out.println(komponentList);
        } catch (InvalidKomponentFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Data i filen er ikke i riktig format på grunn av følgende: " + e.getMessage());
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Kan ikke lese innholdet i filen på grunn av følgende: " + e.toString());
        }
    }

}