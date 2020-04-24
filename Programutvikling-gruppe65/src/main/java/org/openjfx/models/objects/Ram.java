package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Ram extends Komponent implements Serializable {
    private String ramStørrelse;

    public Ram(String merke, String modell, double pris, String ramStørrelse) {
        super(merke, modell, pris);
        this.ramStørrelse = ramStørrelse;
    }

}
