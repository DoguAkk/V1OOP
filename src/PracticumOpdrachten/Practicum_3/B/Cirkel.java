package PracticumOpdrachten.Practicum_3.B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) throws IllegalArgumentException {
        if (rad <= 0)
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        radius = rad;
        xPositie = x;
        yPositie = y;
    }

    @Override
    public String toString() {
        if (radius == 0)
            return null;
        return "cirkel(" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}