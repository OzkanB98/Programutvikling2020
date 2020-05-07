package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

import java.util.ArrayList;

public class Kabinett extends Komponent {
    private String formfaktor;
    private ArrayList<String> hovedbrett;

    public Kabinett(String merke, String type, double pris, String formfaktor, ArrayList<String> hovedbrett) {
        super(merke, type, pris);
        this.formfaktor = formfaktor;
        this.hovedbrett = hovedbrett;
    }
}
