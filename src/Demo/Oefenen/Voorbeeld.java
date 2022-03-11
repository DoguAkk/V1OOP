package Demo.Oefenen;

import java.util.ArrayList;

public class Voorbeeld {

    public static void main(String[] args) {
        ArrayList<Klant> lijst = new ArrayList<>();

        Klant klant1 = new Klant("Dogukan", "2e Daalsedijk 187", "BBZ");
        Klant klant2 = new Klant("Oussie", "brug", "In keiland daarzo");

        lijst.add(klant1);
        lijst.add(klant2);


        int aantal = lijst.size();
        System.out.println("Dit lijst bevat " + aantal + " klanten.");

        for(Klant gegevens : lijst){
            System.out.println(gegevens);
        }


    }
}