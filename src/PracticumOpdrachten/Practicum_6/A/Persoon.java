package PracticumOpdrachten.Practicum_6.A;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Persoon {
    private String naam;
    private double budget;
    ArrayList<Game> games;

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
        games = new ArrayList<>();
    }

    public double getBudget(){
        return budget;
    }

    public boolean koop(Game g){
        if (budget >= g.huidigeWaarde() && !games.contains(g)){
            games.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }

        return false;
    }

    public boolean verkoop(Game g, Persoon koper){
        if (!games.contains(g) )
            return false;
        boolean kopen = koper.koop(g);
        if (kopen){
            budget += g.huidigeWaarde();
            games.remove(g);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = String.format("%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget);
        for(Game g : games){
            s += "\n" + g;
        }
        return s;
    }
}
