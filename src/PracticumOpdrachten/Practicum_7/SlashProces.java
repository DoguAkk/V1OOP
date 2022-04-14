package PracticumOpdrachten.Practicum_7;


import PracticumOpdrachten.Practicum_7.OpmaakProces;

public class SlashProces implements OpmaakProces {

    @Override
    public String maakOp(String input) {
        return input.replace('.', '/');
    }
}

