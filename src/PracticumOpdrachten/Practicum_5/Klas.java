package PracticumOpdrachten.Practicum_5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    ArrayList<Leerling> leerlingen;

    public Klas(String kC) {
        klasCode = kC;
        leerlingen = new ArrayList<>();

    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nWeCijfer) {
        for (Leerling l : leerlingen) {
            if (l.getNaam().equals(nm)){
                l.setCijfer(nWeCijfer);
            }
        }

    }

    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size() ;
    }

    @Override
    public String toString() {
        String str = "In klas " + klasCode + " zitten de volgende leerlingen: " + "\n";
        for (Leerling l : leerlingen) {
            str += l;
        }
        return str;
    }
}