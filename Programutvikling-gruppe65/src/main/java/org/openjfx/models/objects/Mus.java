package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Mus extends Komponent implements Serializable {

    public Mus(String merke, String modell, double pris) {
        super(merke, modell, pris);
    }

}
