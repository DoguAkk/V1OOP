package PracticumOpdrachten.Practicum_4.B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

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
        if(huurder == null){
            return 0;
        }
        if(gehuurdeAuto == null){
            return 0;
        }
        return (gehuurdeAuto.getPrijsPerDag() * aantalDagen) - ((gehuurdeAuto.getPrijsPerDag() * aantalDagen) / 100 * huurder.getKorting());
    }

    @Override
    public String toString() {
        String s = "";
        if (gehuurdeAuto == null){
            s += " er is geen auto bekend";
        } else {
            s += " autotype: " + gehuurdeAuto;
        }
        if (huurder == null){
            s += "\n er is geen huurder bekend";
        } else {
            s += " \n op naam van: " + huurder;
        }
        return s + "\n" + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
