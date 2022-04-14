package PracticumOpdrachten.Practicum_3.B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int y, int x) throws IllegalArgumentException {
        if(rad <= 0)
            System.out.println("Radius moet groter dan 0 zijn!");
        radius = rad;
        xPositie = x;
        yPositie = y;
    }

    @Override
    public String toString() {
        if(radius <= 0){
            return null;
        }
        return "Cirkel " + "(" + yPositie + ", " + xPositie + ") met radius "  + radius;
    }
}
