import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();
        int k = 1;
        double[] array = new double[1000];
        for (double index = 0; index <=1000; index++){
            array[index] = random.nextDouble();
            System.out.println(k +  "  -  "+ array [index]);
            k++;

        }
    }
}
