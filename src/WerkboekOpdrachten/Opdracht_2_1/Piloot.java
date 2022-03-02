package WerkboekOpdrachten.Opdracht_2_1;

public class Piloot {
    private String naam;
    private int vlieguren;
    private double salaris;

    public Piloot(String nm){
        naam = nm;

    }

    public double getSalaris() {
        return salaris;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public void verhoogVliegurenMet(int vvm){
        vlieguren += vvm;
    }

    public void setSalaris(double sl) {
        salaris = sl;
    }

    @Override
    public String toString(){
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }
}
