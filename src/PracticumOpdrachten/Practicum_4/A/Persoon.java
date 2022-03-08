package PracticumOpdrachten.Practicum_4.A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft){
        naam = nm;
        leeftijd = lft;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public String toString() {
        return getNaam() + "; leeftijd " + getLeeftijd() + " jaar";
    }
}
