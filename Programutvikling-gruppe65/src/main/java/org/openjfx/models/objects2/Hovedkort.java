package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

import java.util.ArrayList;

public class Hovedkort extends Komponent {
    private String brikkesett;
    private String sokkel;
    private String støttetRAM;
    private ArrayList<String> bussklokke; // ITX, ATX, osv

    public Hovedkort(String merke, String type, double pris, String brikkesett, String sokkel, String støttetRAM, ArrayList<String> bussklokke) {
        super(merke, type, pris);
        this.brikkesett = brikkesett;
        this.sokkel = sokkel;
        this.støttetRAM = støttetRAM;
        this.bussklokke = bussklokke;
    }
}
