package PracticumOpdrachten.Practicum_4.B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    public void setKorting(double kP) {
        kortingsPercentage = kP;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return " op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
    }
}
