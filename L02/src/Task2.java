import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner rub = new Scanner(System.in);
        System.out.println("Введите количество рублей с клавиатуры:");
        int ruble = rub.nextInt();
        if (ruble == 0){
            System.out.println(ruble + " рублей.");
        }
        else if (ruble == 1){
            System.out.println(ruble + " рубль.");
        }
        else if (ruble>=2 && ruble<=4){
            System.out.println(ruble + " рубля.");
        }
        else if (ruble>4){
            System.out.println(ruble + " рублей.");
        }
        else if (ruble == -1){
            System.out.println(ruble + " рубль.");
        }
        else if (ruble>=-4 && ruble<=-2){
            System.out.println(ruble + " рубля.");
        }
        else if (ruble<-4){
            System.out.println(ruble + " рублей.");
        }



    }
}