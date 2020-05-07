package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.openjfx.App;

import java.io.IOException;

public class KomponentMenyController {

    @FXML
    private void velgKomponent(ActionEvent event) throws IOException {
        App.setRoot("komponentListe");
    }

    @FXML
    private void tilbakeKnapp(ActionEvent event) throws IOException {
        App.setRoot("startside");
    }

    @FXML
    private void byttTilHandlekurv(ActionEvent event) throws IOException {
        App.setRoot("handlekurv");
    }


}
