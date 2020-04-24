package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Strømforsyning extends Komponent implements Serializable {
    private String strømforsyningWatt;

    public Strømforsyning(String merke, String modell, double pris, String strømforsyningWatt) {
        super(merke, modell, pris);
        this.strømforsyningWatt = strømforsyningWatt;
    }

}
