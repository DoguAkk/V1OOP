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
        for(Leerling leerling : leerlingen){
            if(leerling.getNaam().equals(nm)){
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String s = "";
        for(Object namen : leerlingen){
            s += namen + "\n";
        }
        return "In klas " + klasCode + " zitten de volgende leerlingen: "
                + "\n" + s;
    }
}
