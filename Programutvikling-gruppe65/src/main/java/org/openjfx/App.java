package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;
import org.openjfx.models.datavalidering.InvalidKomponentFormatException;
import org.openjfx.models.datavalidering.ValiderDataFraFil;
import org.openjfx.models.filbehandling.JOBJLeser;
import org.openjfx.models.filbehandling.JOBJSkriver;
import org.openjfx.models.filbehandling.Leser;
import org.openjfx.models.filbehandling.Skriver;

import java.io.File;
import java.io.FileNotFoundException;
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


        TilLagring komponenter = new TilLagring();
        Komponent k1 = new Komponent("asus", "gtx 1050", "Skjermkort", "6gb videominne", 2500d);
        Komponent k2 = new Komponent("msi", "gtx 1060", "Skjermkort", "8gb videominne", 2700d);

        komponenter.getKomponentArrayList().add(k1);
        komponenter.getKomponentArrayList().add(k2);



        try {
            Skriver skriver = new JOBJSkriver();
            File file = new File("Komponenter1.jobj");
            skriver.skrivTilFil(file, komponenter);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        try {
            TilLagring lest = new TilLagring();
            Leser leser = new JOBJLeser();
            leser.lesFraFil(new File("Komponenter1.jobj"), lest);
            System.out.println(lest.getKomponentArrayList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        launch();
    }

}