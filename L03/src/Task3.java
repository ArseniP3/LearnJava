/*
3. Сгенерировать массив вещественных чисел из 1000 элементов
(для генерации использовать Random random = new Random(); random.nextDouble()).
Отсортировать массив, найти среднее значение, максимальное и минимальное.
 */
import java.util.Random;

public class Task3{
    public static void main(String[] args) {
        Random random = new Random();
        double[] array = new double[1000];
        int k = 0;
        int index;
        for (index = 0; index < array.length; index++ ){
           array[(int) index] = random.nextDouble();
        }
        for (index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length - index - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (index = 0; index < array.length; index++) {
            k++;
            System.out.println(k + " : " + array[index]);
        }
        double max = array [0];
        double min = array [0];
        double sredn = 0;
        for (index = 0; array.length > index; index++) {
            if (max < array[index])
                max = array[index];
            if (min > array[index])
                min = array[index];
            sredn += array[index]/array.length;
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + sredn);

    }
}