/*
1. Напишите программу, которая печатает массив
сначала в обычном порядке, затем в обратном.
 */

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int array [] = new int [8];
        Random rand = new Random();
        for (int index = 0; index < array.length; index++ ){
            array[index] = rand.nextInt(18);
            System.out.println(array[index]);
        }
        System.out.println("   ");
        for (int index = array.length-1; index < array.length; index-- ){
            System.out.println(array[index]);
        }
    }
}
