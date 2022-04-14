package WerkboekOpdrachten.Opdracht_6_2;

import java.util.ArrayList;

public class FacebookAccount {
    String naam;
    ArrayList<Vriend> vrienden;

    public FacebookAccount(String nm){
        naam = nm;
        vrienden = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV){
        if(!vrienden.contains(nwV)){
            vrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV){
        return vrienden.remove(exV);
    }

    public boolean isVriendMet(Vriend v){
        return vrienden.contains(v);
    }

    public int aantalVrienden(){
        return vrienden.size();
    }

    @Override
    public String toString() {
        String s = naam + " heeft " + vrienden.size() + " vrienden \n";
        for(Vriend v : vrienden)
            s += v + "\n";
        return s;
    }
}
