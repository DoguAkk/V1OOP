package WerkboekOpdrachten.Opdracht_1_5;

public class Student {

    //attributen van klasse student
    private String naam;
    private int studentNummer;

    //constructor
    public Student(String nm){
        naam = nm;
    }

    //constructor
    public Student(String nm, int stNr){
        naam = nm;
        studentNummer = stNr;
    }

    //get methode voor attribuut naam
    public String getNaam(){
        return naam;
    }

    //get methode voor attribuut studentnummer
    public int getStudentNummer() {
        return studentNummer;
    }

    //setter voor studentnummer
    public void setStudentNummer(int stNr){
        this.studentNummer = stNr;
    }

    //tostring methode
    @Override
    public String toString(){
        return "Deze student heet " + naam + " en heeft nummer: " + studentNummer;
    }
}