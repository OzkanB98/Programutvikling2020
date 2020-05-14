package org.openjfx.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TilLagring implements Serializable {
    private static final long serialVersionUID = -2541080297287914483L;

    private List<Komponent> komponentArrayList;
    public TilLagring(){
        komponentArrayList = new ArrayList<>();
    }


    public List<Komponent> getKomponentArrayList() {
        return komponentArrayList;
    }

    public void setKomponentArrayList(List<Komponent> komponentArrayList) {
        this.komponentArrayList = komponentArrayList;
    }

}
