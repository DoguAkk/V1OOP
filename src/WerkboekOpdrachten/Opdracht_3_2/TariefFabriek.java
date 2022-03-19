package WerkboekOpdrachten.Opdracht_3_2;

public class TariefFabriek {
    public static void main(String[] args){
        BelastingTarieven tarief = new BelastingTarieven();
        boolean genereren = true;

        while(genereren) {
            try {
                tarief.produceerBelastingTarieven();
                genereren = false;
            } catch (ArithmeticException ae) {
                System.out.println("mislukt");
            }
        }
    }
}
