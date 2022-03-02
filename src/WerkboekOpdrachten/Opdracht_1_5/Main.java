package WerkboekOpdrachten.Opdracht_1_5;

public class Main {

    public static void main(String [] arg){
        Student student1 = new Student("Sylvester");                 //maakt student 1 aan
        Student student2 = new Student("Karel", 98765432);      //maakt student 2 aan

        System.out.println("naam: " + student1.getNaam());               //toont gegevens via get methode
        System.out.println("nummer: " + student1.getStudentNummer());    //toont gegeven via get methode
        student1.setStudentNummer(12345678);                             //set nieuwe studentnummer in
        System.out.println("toString: " + student1);                     //toont tostring methode van klant 1

        System.out.println(" ");                                         //whitespace tussen gegevens van studenten

        System.out.println("naam: " + student2.getNaam());               //toont gegevens via get methode
        System.out.println("nummer: " + student2.getStudentNummer());    //toont gegevens via get methode
        System.out.println("toString: " + student2.toString());          //toont tostring methode van student 2

    }
}