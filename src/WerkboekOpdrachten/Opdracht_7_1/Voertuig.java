package WerkboekOpdrachten.Opdracht_7_1;

public class Voertuig{
    String merk;
    String type = "onbekend";

    public Voertuig(){
        this("onbekend", "onbekend");
    }

    public Voertuig(String merk){
        this.merk = merk;
    }

    public Voertuig(String merk, String type){
        this.merk = merk;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Merk: " + merk + ", type: " + type;
    }
}
