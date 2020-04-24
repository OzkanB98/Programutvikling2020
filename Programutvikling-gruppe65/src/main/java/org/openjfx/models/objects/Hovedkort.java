package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Hovedkort extends Komponent implements Serializable {
    private String hovedkortType; // AMD eller Intel

    public Hovedkort(String merke, String modell, double pris, String hovedkortType) {
        super(merke, modell, pris);
        this.hovedkortType = hovedkortType;
    }

}
