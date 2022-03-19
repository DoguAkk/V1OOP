package WerkboekOpdrachten.Opdracht_4_2;

public class Eigenaar {
    private String naam;
    private int giroNummer;
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
        return naam + " heeft giro " + giroNummer + ". En is het baasje van " + beestje;
    }
}


