package Demo.Oefenen;

import java.util.ArrayList;

public class Voorbeeld {

    public static void main(String[] args) {
        ArrayList<Double> cijferlijst = new ArrayList<Double>();
        cijferlijst.add(6.9);
        cijferlijst.add(8.1);
        cijferlijst.add(5.2);

        double index1 = cijferlijst.get(1);
        System.out.println(index1);

        for (Double cijfer : cijferlijst) {
            System.out.println(cijfer + " ");
        }

    }
}