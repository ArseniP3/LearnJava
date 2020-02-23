import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner god = new Scanner(System.in);
        System.out.println("Введите год: ");
        int god1 = god.nextInt();
        if ((god1 % 400 == 0) || ((god1 % 4 == 0) && (god1 % 100 != 0))) {
            System.out.println("Год високосный: ");
        } else {
            System.out.println("Год не високосный: ");
        }
    }
}


