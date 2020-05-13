package org.openjfx.models;

import java.util.ArrayList;

public class Datamaskin extends TilLagring {

    //En liste med komponenter
    private ArrayList<Komponent> komponenter;

    public Datamaskin(ArrayList<Komponent> komponenter) {
        this.komponenter = komponenter;
    }

    //Evt bruker
}
