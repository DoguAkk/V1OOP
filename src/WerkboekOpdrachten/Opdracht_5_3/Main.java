package WerkboekOpdrachten.Opdracht_5_3;

import WerkboekOpdrachten.Opdracht_4_2.Huisdier;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Huisdier> h = new ArrayList<>();
        Huisdier h1 = new Huisdier("Boncuk", "de huiskat");
        Huisdier h2 = new Huisdier("Pluisje", "de britse korthaar");

        h.add(h1);
        h.add(h2);
        for(Huisdier dier : h){
            System.out.println(dier);
        }

        System.out.println(" "); //empty space

        h.add(new Huisdier("Vlekje", "de zwerfkat"));

        for(Huisdier dier : h){
            System.out.println(dier);
        }

        System.out.println(" "); // empty space

        System.out.println(h.size());

        h.add(0, new Huisdier("Parel", "de Perziche kat"));

        System.out.println(" "); // empty space

        for(Huisdier dier : h){
            System.out.println(dier);
        }

        System.out.println(" "); // empty space

        h.set(2, new Huisdier("Cash", "de dure kat"));

        for(Huisdier dier : h){
            System.out.println(dier);
        }

    }
}
