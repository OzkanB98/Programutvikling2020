package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Skjerm extends Komponent implements Serializable {

    private short skjermstørrelse;
    private short antallHz;
    private String standardOppløsning;

    public Skjerm(String merke, String type, double pris, short skjermstørrelse, short antallHz, String standardOppløsning) {
        super(merke, type, pris);
        this.skjermstørrelse = skjermstørrelse;
        this.antallHz = antallHz;
        this.standardOppløsning = standardOppløsning;
    }
}