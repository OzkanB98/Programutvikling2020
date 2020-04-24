package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Skjermkort extends Komponent implements Serializable {

    public Skjermkort(String merke, String modell, double pris) {
        super(merke, modell, pris);
    }

}
