package Lecture02;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        Scanner rub = new Scanner(System.in);
        System.out.println("Введите количество рублей с клавиатуры:");
        int ruble = rub.nextInt();
        switch (ruble) {
            case 0 :
                System.out.println(ruble + " рублей.");
                break;
            case 1 :
                System.out.println(ruble + " рубль.");
                break;
            case 2 :
            case 3 :
            case 4 :
            case -2 :
            case -3 :
            case -4 :
                System.out.println(ruble + " рубля.");
                break;

        }
        if (ruble>4){
            System.out.println(ruble + " рублей."); //Так как в Switch нельзязадавать диапазон значений используем If
        }
        if (ruble<-4){
            System.out.println(ruble + " рублей.");
        }
    }
}
