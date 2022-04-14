package PracticumOpdrachten.Practicum_6.A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear();
        int jaar = huidigJaar - releaseJaar;
        double huidigePrijs = nieuwprijs;
        for (int y = 0; y < jaar; y++) {
            huidigePrijs = huidigePrijs / 100 * 70;
        }
        return huidigePrijs;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if(andereObject instanceof Game game){
            if(this.naam.equals(game.naam) && this.releaseJaar == game.releaseJaar){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f", naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
