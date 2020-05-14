package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.openjfx.App;

import java.io.IOException;

public class StartController {

    @FXML
    private void byttTilAdmin(ActionEvent event) throws IOException {
        /*
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/resources/org/openjfx/administrator.fxml"));
        Parent root = loader.load();
        Scene adminScene = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(adminScene);
        window.show();

         */

        App.setRoot("administrator");
    }

    @FXML
    private void byttTilKomponentMeny(ActionEvent event) throws IOException {
        App.setRoot("komponentMeny");
    }
}
