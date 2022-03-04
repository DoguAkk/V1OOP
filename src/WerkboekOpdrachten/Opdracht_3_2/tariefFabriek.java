package WerkboekOpdrachten.Opdracht_3_2;

public class tariefFabriek {
    public static void main(String[] args) {
        BelastingTarieven bt = new BelastingTarieven();
        {
            boolean genererenNogNietGeslaagd = true;

            while (genererenNogNietGeslaagd) {
                try {
                    bt.produceerBelastingTarieven();
                    genererenNogNietGeslaagd = false;
                } catch (ArithmeticException ae) {
                    System.out.println("mislukt");
                }
            }
        }
    }
}