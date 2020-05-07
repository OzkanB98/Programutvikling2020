package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

public class Lagring extends Komponent {
    private String lagringsplass;
    private String lagringsType; // HDD, SSD eller M.2

    public Lagring(String merke, String modell, double pris, String lagringsplass, String lagringsType) {
        super(merke, modell, pris);
        this.lagringsplass = lagringsplass;
        this.lagringsType = lagringsType;
    }

}