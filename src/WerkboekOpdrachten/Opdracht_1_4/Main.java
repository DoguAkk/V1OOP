package WerkboekOpdrachten.Opdracht_1_4;

public class Main {

    public static void main(String[] arg) {

        Student st1 = new Student("Sylvester");              //Maakt student 1 aan

        System.out.println( "getter: " + st1.getNaam() );        //toont gegevens van getter om te kunnen tonen
        System.out.println( "toString: " + st1.toString() );     //toont tostring methode

        Student st2 = new Student("Karel");                  //maakt student 2 aan

        System.out.println( "getter: " + st2.getNaam() );        //toont gegevens van getter
        System.out.println( "toString: " + st2.toString() );     //toont tostring methode

    }

}
