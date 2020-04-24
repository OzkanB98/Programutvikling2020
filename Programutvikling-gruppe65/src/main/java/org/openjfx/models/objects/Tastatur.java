package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Tastatur extends Komponent implements Serializable {

    public Tastatur(String merke, String modell, double pris) {
        super(merke, modell, pris);
    }

}
