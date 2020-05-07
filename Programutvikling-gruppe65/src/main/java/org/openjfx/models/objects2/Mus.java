package org.openjfx.models.objects2;

import org.openjfx.models.Komponent;

public class Mus extends Komponent {
    private String overføring;
    private String grensesnitt;
    private String sensor;
    private short dpi;

    public Mus(String merke, String type, double pris, String overføring, String grensesnitt, String sensor, short dpi) {
        super(merke, type, pris);
        this.overføring = overføring;
        this.grensesnitt = grensesnitt;
        this.sensor = sensor;
        this.dpi = dpi;
    }
}
