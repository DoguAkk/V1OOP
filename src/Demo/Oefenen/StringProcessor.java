package Demo.Oefenen;

import java.util.ArrayList;

public class StringProcessor {
    ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<>();
    }

    public String verwerk(String input){
        String s = input;
        for(OpmaakProces OP : processen){
            s = OP.maakOp(s);
        }
        return s;
    }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}
