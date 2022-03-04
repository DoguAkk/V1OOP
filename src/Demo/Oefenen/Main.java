package Demo.Oefenen;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int getal1 = new Random().nextInt();
        int getal2 = new Random().nextInt();

        try {
            int uitkomst = getal1 / getal2;
            System.out.println(uitkomst);
        } catch (ArithmeticException ae) {
            System.out.println("Fout opgetreden: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Algemene fout: " + e.getMessage());
        }
    }
}
