package PracticumOpdrachten.Practicum_5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode = kC;
        leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l){
        leerlingen.add(l);

    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for(Leerling l : leerlingen){
            if(l.getNaam().equals(nm)){
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
        for(Leerling i : leerlingen){
            s += i + "\n";
        }
        return s;
    }
}
