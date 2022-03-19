package PracticumOpdrachten.Practicum_2.B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String nm) {
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public String toString() {
        return naam + "\t" + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
