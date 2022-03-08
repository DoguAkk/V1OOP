package WerkboekOpdrachten.Opdracht_3_2;

public class TariefFabriek {
    public static void main(String [] args){
        BelastingTarieven tarief = new BelastingTarieven();

        boolean percentage = true;
        while(percentage){
            try {
                tarief.produceerBelastingTarieven();
                percentage = false;
            } catch (Exception e) {
                System.out.println("mislukt");
            }
        }
    }
}
