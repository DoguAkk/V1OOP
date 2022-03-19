package PracticumOpdrachten.Practicum_4.B;

public class Auto {
    private String type;
    private double PrijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        PrijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        PrijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return PrijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met prijs per dag: " + getPrijsPerDag();
    }
}
