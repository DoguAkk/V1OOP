package WerkboekOpdrachten.Opdracht_1_4;

public class Student {
    //Attribuut van klasse Student
    private String naam;

    //constructor
    public Student(String nm){
        naam = nm;
    }

    //Get methode
    public String getNaam(){
        return naam;
    }

    //tostring methode
    @Override
    public String toString(){
        return "Deze student heet " + naam;
    }
}

