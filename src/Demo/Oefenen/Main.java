package Demo.Oefenen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Dogukan", 26);
        Persoon p2 = new Persoon("Dogukan", 26);

        boolean vergelijking1 = p1.equals(p2);
        boolean vergelijking2 = p1 == p2;


    }
}