package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Kjøling extends Komponent implements Serializable {
// Type her er vannkjøling eller luftkjøling

    public Kjøling(String merke, String type, double pris) {
        super(merke, type, pris);
    }
}
