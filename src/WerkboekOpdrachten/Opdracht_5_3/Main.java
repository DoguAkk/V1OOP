package WerkboekOpdrachten.Opdracht_5_3;

import WerkboekOpdrachten.Opdracht_4_2.Huisdier;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Huisdier> dieren = new ArrayList<>();
        Huisdier dier1 = new Huisdier("Dobermann", "de hond");
        Huisdier dier2 = new Huisdier("Boncuk", "de kat");
        dieren.add(dier1);
        dieren.add(dier2);
        dieren.add(new Huisdier("Messi", "de geit"));
        System.out.println(dieren.size());
        for(Huisdier dier : dieren){
            System.out.println(dier);
        }

        System.out.println(" ");

        dieren.add(0, new Huisdier("Karel", "de schildpad"));
        dieren.set(2, new Huisdier("Snotter", "de Lama"));
        for(Huisdier dier : dieren){
            System.out.println(dier);
        }


    }
}
