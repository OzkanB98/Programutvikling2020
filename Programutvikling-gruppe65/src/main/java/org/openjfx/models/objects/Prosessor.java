package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Prosessor extends Komponent implements Serializable {
    private String prosessorType; // AMD eller Intel

    public Prosessor(String merke, String modell, double pris, String prosessorType) {
        super(merke, modell, pris);
        this.prosessorType = prosessorType;
    }

}
