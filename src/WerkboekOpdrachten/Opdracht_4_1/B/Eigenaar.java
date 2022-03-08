package WerkboekOpdrachten.Opdracht_4_1.B;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm){
        naam = nm;
    }

    public void setBeestje(Huisdier hd) {
        beestje = hd;
    }

    public Huisdier getBeestje() {
        return beestje;
    }

    @Override
    public String toString() {
        return naam + " heeft giro " + giroNr + ". En is het baastje van " + beestje;
    }
}
