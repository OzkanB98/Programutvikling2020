package org.openjfx.models.objects;

import org.openjfx.models.Komponent;

import java.io.Serializable;

public class Tastatur extends Komponent {
    private String layout; // nordisk, engelsk
    private String teknologi; // mekanisk, membran, mecha-membran
    private String overføring; // kablet, trådløs
    private String bakbelysning; // RGB eller statisk farge


    public Tastatur(String merke, String type, double pris, String layout, String teknologi, String overføring, String bakbelysning) {
        super(merke, type, pris);
        this.layout = layout;
        this.teknologi = teknologi;
        this.overføring = overføring;
        this.bakbelysning = bakbelysning;
    }
}
