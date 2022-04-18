package WerkboekOpdrachten.Opdracht_7_1;

public class Main {
    public static void main(String[] args){
        Voertuig v3 = new Voertuig("Ford", "Fiesta");
        Vrachtwagen v4 = new Vrachtwagen("Scania", "s5", 34);

        System.out.println(v3.toString());
        System.out.println(v4.toString());
    }
}
