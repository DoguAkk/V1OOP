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

    public double totaalPrijs() {
        if (huurder == null || gehuurdeAuto == null)
            return 0;
        return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (100 - huurder.getKorting()) / 100;
    }

    @Override
    public String toString() {
        String tekst = "";
        if (getGehuurdeAuto() == null)
            tekst += " er is geen auto bekend";
        else
            tekst += getGehuurdeAuto();
        tekst += "\n";
        if (getHuurder() == null)
            tekst += " er is geen huurder bekend";
        else
            tekst += getHuurder();
        tekst += "\n aantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
        return tekst;

    }
}
