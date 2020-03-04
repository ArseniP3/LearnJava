/*
2. Напишите программу, заносящую в массив первые 100 натуральных чисел,
делящихся на 13 или на 17, и печатающую его.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int k = 1;
        for(int index = 1; k <= array.length; index++) {
            if(index % 13 == 0 || index  % 17 == 0){
                System.out.println(k + ":" + index);
                k++;
            }
        }
    }
}
