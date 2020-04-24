package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Skjerm extends Komponent implements Serializable {

    public Skjerm(String merke, String modell, double pris) {
        super(merke, modell, pris);
    }

}