package org.openjfx;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;
import org.openjfx.models.avvik.InvalidKomponentFormatException;
import org.openjfx.models.datavalidering.CsvValidering;
import org.openjfx.models.datavalidering.ValiderDataFraFil;
import org.openjfx.models.filbehandling.CSVLeser;
import org.openjfx.models.filbehandling.CSVSkriver;
import org.openjfx.models.filbehandling.Skriver;

import java.io.*;
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

    public static void main(String[] args) throws Exception {
        launch();

        CSVSkriver csvSkriver = new CSVSkriver();
        TilLagring tilLagring = new TilLagring();

        Komponent komponent = new Komponent("Asus", "GTX1080", "Kategori", "Detaljer", 2500.0);
        Komponent komponent2 = new Komponent("Asus", "GTX10801", "Kategori", "Detaljer", 2500.0);
        tilLagring.getKomponentArrayList().add(komponent);
        tilLagring.getKomponentArrayList().add(komponent2);
        csvSkriver.skrivTilFil(new File("Komponenter.csv"), tilLagring);


        CSVLeser csvLeser = new CSVLeser();
        TilLagring tilLagring1 = new TilLagring();

        csvLeser.lesFraFil(new File("Komponenter.csv"), tilLagring1);
        System.out.println(tilLagring1.getKomponentArrayList());

    }
}










        /*
        ValiderDataFraFil lesFraFil = new ValiderDataFraFil();

        try {
            List<Komponent> komponentList = lesFraFil.read("Filnavn.csv");
            System.out.println(komponentList);
        } catch (InvalidKomponentFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Data i filen er ikke i riktig format på grunn av følgende: " + e.getMessage());
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR, "Kan ikke lese innholdet i filen på grunn av følgende: " + e.toString());
        }
         */