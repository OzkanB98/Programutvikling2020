package models.objects;

public class Strømforsyning {
    private String strømforsyningNavn;
    private String strømforsyningWatt;
    private double strømforsyningPris;

    public Strømforsyning(String strømforsyningNavn, String strømforsyningWatt, double strømforsyningPris) {
        this.strømforsyningNavn = strømforsyningNavn;
        this.strømforsyningWatt = strømforsyningWatt;
        this.strømforsyningPris = strømforsyningPris;
    }

    public String getStrømforsyningNavn() {
        return strømforsyningNavn;
    }

    public String getStrømforsyningWatt() {
        return strømforsyningWatt;
    }

    public double getStrømforsyningPris() {
        return strømforsyningPris;
    }
}
