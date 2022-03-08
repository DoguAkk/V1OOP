package PracticumOpdrachten.Practicum_4.B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return " autotype: " + type + " met prijs per dag: " + prijsPerDag;
    }
}
