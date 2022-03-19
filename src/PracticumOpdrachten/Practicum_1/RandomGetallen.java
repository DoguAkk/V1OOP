package PracticumOpdrachten.Practicum_1;
import java.math.RoundingMode;
import java.util.Random;
import java.text.DecimalFormat;

public class RandomGetallen {
    public static void main(String[] args) {
        Random random = new Random();
        float count = 0;
        while (count < 10){
            count++;
            float getal = random.nextFloat(1);
            double rondGetal = Math.round(getal * 10) / 10.0;
            System.out.println(rondGetal);
        }
    }
}
