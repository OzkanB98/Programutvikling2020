package org.openjfx.controllers;

import javafx.fxml.FXML;
import org.openjfx.App;

import java.io.IOException;

public class StartController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.loadFXML("Administrator");
    }
}
