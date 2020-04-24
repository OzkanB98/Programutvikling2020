package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Lagring extends Komponent implements Serializable {
    private String lagringsplass;
    private String lagringsType; // HDD, SSD eller M.2

    public Lagring(String merke, String modell, double pris, String lagringsplass, String lagringsType) {
        super(merke, modell, pris);
        this.lagringsplass = lagringsplass;
        this.lagringsType = lagringsType;
    }

}