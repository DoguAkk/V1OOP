package PracticumOpdrachten.Practicum_2.A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double le, double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad(){

    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double br) {
        breedte = br;
    }

    public void setLengte(double le) {
        lengte = le;
    }

    public void setDiepte(double di) {
        diepte = di;
    }

    public double inhoud(){
        return diepte * lengte * breedte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + getBreedte() + " meter breed, " + getLengte() + " meter lang, en " + getDiepte() + " meter diep";
    }
}
