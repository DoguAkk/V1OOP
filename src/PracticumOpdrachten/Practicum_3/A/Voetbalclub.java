package PracticumOpdrachten.Practicum_3.A;

//Deze opdracht heb ik samen gewerkt met Oussama

public class Voetbalclub {
    private String name;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        name = naam;
    }

    public Voetbalclub() {

    }

    public String getName() {
        if (name == null || name == "")
            return name = "FC";
        return name;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = 1;
        if (ch == 'g')
            aantalGelijk = 1;
        if (ch == 'v')
            aantalVerloren = 1;
    }

    public int aantalGespeeld(){
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten(){
        return  (aantalGewonnen * 3) + aantalGelijk;

    }

    public String toString(){
        return name + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }

    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax       ");
        Voetbalclub feij = new Voetbalclub("Feijenoord ");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);

    }
}
