package org.openjfx.models.filtrering;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.openjfx.models.Komponent;
import org.openjfx.models.TilLagring;

import java.util.List;
import java.util.stream.Collectors;

public class FiltrerKategori {

    private final ObservableList<Komponent> komponentListe = FXCollections.observableArrayList();

    public void filtrerKategori() {
        TilLagring komponenter = new TilLagring();

        List<Komponent> komponentList = komponenter.getKomponentArrayList()
                .stream()
                .filter(x -> x.getProduktKategori().equals("Hovedkort")) // Eller contains
                .collect(Collectors.toList());

        // .filter(Komponent::hovedkortKategori)

    }

    public ObservableList<Komponent> hentKategori(String kategori) {
        try {
            return komponentListe.stream().filter(kat -> kat.getProduktKategori()
                    .equals("Hovedkort"))
                    .collect(Collectors.toCollection(FXCollections::observableArrayList));
        } catch (Exception e) {
            return komponentListe;
        }
    }


    public static ObservableList<Komponent> filtrerKategori(/*String filtrerInput, */String filtreringsType, ObservableList<Komponent> filtrertListe, ObservableList<Komponent> komponentListe) {
        switch (filtreringsType) {
            case "Hovedkort":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("hovedkort"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                //return filtrertListe; //Kanskje dette istedenfor break?
                break;
            case "Skjermkort":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("skjermkort"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Prosessor":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("prosessor"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Minne":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("minne"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Kjøling":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("kjøling"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Strømforsyning":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("strømforsyning"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Kabinett":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("kabinett"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Skjerm":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("skjerm"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Lagring":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("lagring"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Mus":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("mus"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
            case "Tastatur":
                filtrertListe = komponentListe.stream()
                        .filter(komponent -> komponent.getProduktKategori().toLowerCase().contains("tastatur"))
                        .collect(Collectors.toCollection(FXCollections::observableArrayList));
                break;
        }
        return filtrertListe;
    }

    /*
    public ArrayList<Komponent> Kategorifiltrering(File file) {
        Komponenter komponenter = new Komponenter();
        ArrayList<Komponent> komponenterList = new ArrayList<>();
        komponenter.getKomponentArrayList().stream()
                .filter(x -> x.getProduktKategori().contains("Hovedkort"))
                .collect(Collectors.toList());
        return komponenterList;
    }
     */
}
