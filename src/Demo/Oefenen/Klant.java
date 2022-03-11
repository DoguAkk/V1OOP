package Demo.Oefenen;

public class Klant {
    private String naam;
    private String adres;
    private String plaatsnaam;

    public Klant(String nm, String adr, String pl){
        naam = nm;
        adres = adr;
        plaatsnaam = pl;
    }

    @Override
    public String toString() {
        return naam + " woont op " + adres + " in " + plaatsnaam;
    }
}
