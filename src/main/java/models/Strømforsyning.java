package models;

public class Strømforsyning {
    private StrømforsyningNavn strømforsyningNavn;
    private StrømforsyningWatt strømforsyningWatt;
    private StrømforsyningPris strømforsyningPris;

    public Strømforsyning(StrømforsyningNavn strømforsyningNavn, StrømforsyningWatt strømforsyningWatt, StrømforsyningPris strømforsyningPris) {
        this.strømforsyningNavn = strømforsyningNavn;
        this.strømforsyningWatt = strømforsyningWatt;
        this.strømforsyningPris = strømforsyningPris;
    }

    public StrømforsyningNavn getStrømforsyningNavn() {
        return strømforsyningNavn;
    }

    public StrømforsyningWatt getStrømforsyningWatt() {
        return strømforsyningWatt;
    }

    public StrømforsyningPris getStrømforsyningPris() {
        return strømforsyningPris;
    }
}
