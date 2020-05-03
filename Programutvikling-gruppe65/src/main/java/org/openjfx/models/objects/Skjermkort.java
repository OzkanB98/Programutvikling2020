package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Skjermkort extends Komponent implements Serializable {

    private short minne;
    private short antallSkjermer;
    private String fabrikant;

    public Skjermkort(String merke, String type, double pris, short minne, short antallSkjermer, String fabrikant) {
        super(merke, type, pris);
        this.minne = minne;
        this.antallSkjermer = antallSkjermer;
        this.fabrikant = fabrikant;
    }
}
