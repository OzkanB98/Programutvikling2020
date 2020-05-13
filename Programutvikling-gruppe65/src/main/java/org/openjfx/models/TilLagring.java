package org.openjfx.models;

import java.io.Serializable;
import java.util.ArrayList;

public class TilLagring implements Serializable {

    private ArrayList<Komponent> komponentArrayList;

    public TilLagring() {
        this.komponentArrayList = new ArrayList<>();
    }

    public ArrayList<Komponent> getKomponentArrayList() {
        return komponentArrayList;
    }

    public void setKomponentArrayList(ArrayList<Komponent> komponentArrayList) {
        this.komponentArrayList = komponentArrayList;
    }

}
