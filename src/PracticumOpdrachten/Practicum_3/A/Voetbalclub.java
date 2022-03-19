package PracticumOpdrachten.Practicum_3.A;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String nm) {
        naam = nm;
    }
    public Voetbalclub(){
    }

    public String getNaam() {
        if(naam == null || naam == ""){
            return "FC";
        }
        return naam;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
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
        return getNaam() + "\t" + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}