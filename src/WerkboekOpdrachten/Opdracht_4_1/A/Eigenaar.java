package WerkboekOpdrachten.Opdracht_4_1.A;

public class Eigenaar {
    private String naam;
    private int giroNr;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) {
        giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + " heeft giro " + giroNr;
    }
}