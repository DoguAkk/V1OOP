package WerkboekOpdrachten.Opdracht_3_2;

public class TariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven tarief = new BelastingTarieven();
        boolean tariefProductie = true;
        while(tariefProductie) {
            try {
                tarief.produceerBelastingTarieven();
                tariefProductie = false;
            } catch (ArithmeticException ae) {
                System.out.println("mislukt");
            }
        }
    }
}