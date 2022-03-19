package PracticumOpdrachten.Practicum_4.A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouw in " + bouwjaar + "\n"
                + "en heeft huisbaar " + huisbaas;
    }
}
