package WerkboekOpdrachten.Opdracht_5_2;

public class Main {
    public static void main(String[] args){
        int leeftijd = 80;
        System.out.println(!(leeftijd <= 65));

        int x = 10;
        System.out.println(!(x >= 18 && x < 40));				// x < 18 || x >= 40
        System.out.println((x >= 10 && x <= 20 || x > 40));		// 10 <= x <= 20 of x > 40
        System.out.println((x >= 10 && (x <= 20 || x > 40)));	// 10 <= x <= 20 of x > 40
        System.out.println((x >= 10 || x > 40) && (x <= 20));	// 10 <= x <= 20

        char ch = 0;
        System.out.println((ch == 'A' && ch == 'B' ));			// geen waarden mogelijk
        System.out.println(!(ch == 'A' || ch == 'B' ));			// alles behalve 'A' en 'B'
    }


}
