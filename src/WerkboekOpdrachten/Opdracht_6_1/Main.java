package WerkboekOpdrachten.Opdracht_6_1;

public class Main {
    public static void main(String [] args){
        String s1 = "route" + 6 + 6;
        String s2 = 6 + 6 + "route";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "concert" + "piano";
        String s4 = "concertpiano";

        System.out.println(s3 == s4);       //vergelijkt inhoud van strings
        System.out.println(s3.equals(s4));  //vergelijkt beginadres van strings

        System.out.println(s4.length());    //inclusief spaties en leestekens
        System.out.println(s4.charAt(3));

        String s5 = "boom";
        String s6 = "roos";
        System.out.println(s5.compareTo(s6));

        String s7 = "123";
        int i = Integer.parseInt(s7);
        System.out.println(i);

        double d = Double.parseDouble(s7);
        System.out.println(d);

    }

}
