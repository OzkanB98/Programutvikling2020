package org.openjfx.models;

import org.openjfx.models.objects.*;

public class Datamaskin {
    private Hovedkort hovedkort;
    private Kabinett kabinett;
    private Prosessor prosessor;
    private Lagring lagring;
    private Ram ram;
    private Mus mus;
    private Skjerm skjerm;
    private Skjermkort skjermkort;
    private Tastatur tastatur;

    public Datamaskin(Hovedkort hovedkort, Kabinett kabinett, Prosessor prosessor, Lagring lagring, Ram ram, Mus mus, Skjerm skjerm, Skjermkort skjermkort, Tastatur tastatur) {
        this.hovedkort = hovedkort;
        this.kabinett = kabinett;
        this.prosessor = prosessor;
        this.lagring = lagring;
        this.ram = ram;
        this.mus = mus;
        this.skjerm = skjerm;
        this.skjermkort = skjermkort;
        this.tastatur = tastatur;
    }
}
