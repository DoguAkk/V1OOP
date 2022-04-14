package WerkboekOpdrachten.Opdracht_7_1;

public class Vrachtwagen extends Voertuig{
    int laadvermogen;

    public Vrachtwagen(){;
    }

    public Vrachtwagen(String merk, int laadvermogen){
        this.merk = merk;
        this.laadvermogen = laadvermogen;
    }

    public Vrachtwagen(String merk, String type, int laadvermogen){
        this.merk = merk;
        this.type = type;
        this.laadvermogen = laadvermogen;
    }

    @Override
    public String toString() {
        return "Vrachtwagen. Merk: " + merk + ", type: " + type + ", met een laadvermogen van " + laadvermogen + " ton";
    }
}
