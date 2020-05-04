package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Strømforsyning extends Komponent implements Serializable {
    private short effekt; // Watt
    private String koblingstype;

    public Strømforsyning(String merke, String type, double pris, short effekt, String koblingstype) {
        super(merke, type, pris);
        this.effekt = effekt;
        this.koblingstype = koblingstype;
    }
}
