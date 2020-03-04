import java.util.Scanner;

/*
7. Написать алгоритм расчета факториала,
используя циклы (for и while).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите чисо, факториал которого хотите узнать: ");
        int f = sc.nextInt();
        int factor = 1;
        for (int i = 1; i<= f; i++){
            factor = i * factor;
        }
        System.out.println("Факториал числа " + f + " равен: " + factor);
    }
}
