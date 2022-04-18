package PracticumOpdrachten.Practicum_7;

public class NieuwProces implements OpmaakProces{

    @Override
    public String maakOp(String input) {

        return input.replace(".", "!");
    }
}
