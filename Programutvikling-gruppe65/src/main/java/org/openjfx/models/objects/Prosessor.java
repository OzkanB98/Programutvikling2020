package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Prosessor extends Komponent implements Serializable {
    private short kjerner; // AMD eller Intel
    private short strenger;
    private double hastighet;
    private double turbo;
    private String sokkeltype;


    public Prosessor(String merke, String type, double pris, short kjerner, short strenger, double hastighet, double turbo, String sokkeltype) {
        super(merke, type, pris);
        this.kjerner = kjerner;
        this.strenger = strenger;
        this.hastighet = hastighet;
        this.turbo = turbo;
        this.sokkeltype = sokkeltype;
    }
}
