package WerkboekOpdrachten.Opdracht_6_2;

public class Vriend {
    String voornaam;
    String achternaam;
    String email;

    public Vriend(String vnm, String anm, String em){
        voornaam = vnm;
        achternaam = anm;
        email = em;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;

        if(andereObject instanceof Vriend){
            Vriend v = (Vriend) andereObject;
            if(this.voornaam.equals(v.voornaam) &&
                    this.achternaam.equals(v.achternaam) &&
                     this.email.equals(v.email)){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return voornaam + " " + achternaam + ", email: " + email;
    }
}
