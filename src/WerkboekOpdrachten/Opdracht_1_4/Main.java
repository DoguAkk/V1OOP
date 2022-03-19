package WerkboekOpdrachten.Opdracht_1_4;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sylvester");
        Student s2 = new Student("Karel");
        System.out.println("getter: " + s1.getNaam());
        System.out.println("toString: Deze student heet: " + s1);
        System.out.println("getter: " + s2.getNaam());
        System.out.println("toString: Deze student heet: " + s2);
    }
}
