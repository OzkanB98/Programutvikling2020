package org.openjfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.openjfx.App;

import java.io.IOException;

public class AdminController {

    @FXML
    private void tilbakeKnapp(ActionEvent event) throws IOException {
        App.setRoot("startside");
    }
}
