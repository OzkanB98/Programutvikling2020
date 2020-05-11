package org.openjfx.models.datavalidering;

import java.io.IOException;

public class InvalidKomponentFormatException extends IOException {
    InvalidKomponentFormatException(String message) {
        super(message);
    }
}
