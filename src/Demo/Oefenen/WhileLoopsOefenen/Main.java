package Demo.Oefenen.WhileLoopsOefenen;

public class Main {
    public static void main(String[] args){

        int getal = 0;
        while(getal <= 10) {
            try {
                System.out.println(+getal);
                getal++;
            } catch (Exception e) {
                System.out.println("is klaar");
            }
        }
    }
}
