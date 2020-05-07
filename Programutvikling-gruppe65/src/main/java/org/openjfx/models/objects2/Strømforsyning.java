package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

public class Strømforsyning extends Komponent {
    private short effekt; // Watt
    private String koblingstype;

    public Strømforsyning(String merke, String type, double pris, short effekt, String koblingstype) {
        super(merke, type, pris);
        this.effekt = effekt;
        this.koblingstype = koblingstype;
    }
}
