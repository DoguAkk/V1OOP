package WerkboekOpdrachten.Opdracht_5_3;
import WerkboekOpdrachten.Opdracht_4_1.B.Huisdier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Huisdier> dieren = new ArrayList<>();

        Huisdier dier1 = new Huisdier("Karel", "de schildpad");
        Huisdier dier2 = new Huisdier("Mufasa", "de leeuw");

        dieren.add(dier1);
        dieren.add(dier2);
        dieren.add(new Huisdier("Max", "de hond"));

        int aantal = dieren.size();
        System.out.println("Deze list bevat " + aantal + " dieren");

        for(int i = 0; i < dieren.size(); i++){
            System.out.println(dieren.get(i));
        }

        System.out.println(" ");

        dieren.add(0, new Huisdier("Peter", "de cavia"));

        int nieuweAantal = dieren.size();

        System.out.println("Deze list bevat " + nieuweAantal + " dieren");


        for(int i = 0; i < dieren.size(); i++){
            System.out.println(dieren.get(i));
        }

        System.out.println(" ");

        dieren.set(2, new Huisdier("Boncuk", "de kat"));

        for(int i = 0; i < dieren.size(); i++){
            System.out.println(dieren.get(i));
        }


    }
}
