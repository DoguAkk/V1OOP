package PracticumOpdrachten.Practicum_4.B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){

    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(){
        if(gehuurdeAuto == null || huurder == null){
            return 0;
        } else {
            double korting = (getAantalDagen() * gehuurdeAuto.getPrijsPerDag()) / 100 * huurder.getKorting();
            return (getAantalDagen() * gehuurdeAuto.getPrijsPerDag()) - korting;
        }
    }

    @Override
    public String toString() {
        String s = "";

        //de if-statements voor gehuurdeAuto
        if (gehuurdeAuto == null) {
            s += " er is geen auto bekend\n";
        } else {
            s += " Autotype: " + gehuurdeAuto + "\n";
        }

        //de if-statements voor huurder
        if (huurder == null){
            s += " er is geen huurder bekend\n";
        } else {
            s += huurder + "\n";
        }

        //returnt hele String (de inhoud van s is afhankelijk van de statements hierboven)
        return s + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
