package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

public class Skjermkort extends Komponent {
    private short minne;
    private short antallSkjermer; // antall innganger
    private String fabrikant; // AMD eller Nvidia

    public Skjermkort(String merke, String type, double pris, short minne, short antallSkjermer, String fabrikant) {
        super(merke, type, pris);
        this.minne = minne;
        this.antallSkjermer = antallSkjermer;
        this.fabrikant = fabrikant;
    }
}
