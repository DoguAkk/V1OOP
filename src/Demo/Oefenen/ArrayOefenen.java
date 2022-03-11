package Demo.Oefenen;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class ArrayOefenen {
    public static void main(String[] args){
        ArrayList<Integer> getallen = new ArrayList();

        getallen.add(1);
        getallen.add(2);
        getallen.add(3);

        for(int i : getallen){
            System.out.println(i);
            if(getallen.get(2).equals(3)){
                getallen.set(0, 3);
            } else {
                System.out.println("je bent een noob");
            }
        }

        System.out.println(getallen);
    }
}
