package WerkboekOpdrachten.Opdracht_7_1;

public class Vrachtwagen extends Voertuig{
    private int laadVermogen = 0;

    public Vrachtwagen(){
    }

    public Vrachtwagen(String merk, int laadVermogen){
        super(merk);
        this.laadVermogen = laadVermogen;

    }

    public Vrachtwagen(String merk, String type, int laadVermogen){
        super(merk, type);
        this.laadVermogen = laadVermogen;

    }

    public String toString(){
        return "Vrachtwagen. Merk: " + merk + ", type: " + type + ", met een laadvermogen van " + laadVermogen + " ton";
    }
}
