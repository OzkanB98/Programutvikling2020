package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Ram extends Komponent {
    private String ramStørrelse;
    private short hastighet;
    private String teknologi; // DDR3, DDR4 osv

    public Ram(String merke, String type, double pris, String ramStørrelse, short hastighet, String teknologi) {
        super(merke, type, pris);
        this.ramStørrelse = ramStørrelse;
        this.hastighet = hastighet;
        this.teknologi = teknologi;
    }
}
