import java.util.Scanner;

/*
6. Имеется целое число, определить является ли это число
простым, т.е. делится без остатка только на 1 и себя.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Ввведите число, которое хотите проверить: ");
        int number = scan.nextInt();
        for ( int i=2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Это число составное.");
                return;
            }
        }
        System.out.println("Это число простое");
    }
}

