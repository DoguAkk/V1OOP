package WerkboekOpdrachten.Opdracht_2_1;

public class Piloot {
    private String naam;
    private int vlieguren;
    private double salaris;

    public Piloot(String nm) {
        naam = nm;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public void verhoogVliegurenMet(int vg) {
        vlieguren += vg;
    }

    public void setSalaris(double sl) {
        salaris = sl;
    }

    @Override
    public String toString() {
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }
}
