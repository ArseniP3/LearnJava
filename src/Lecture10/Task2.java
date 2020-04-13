package Lecture10;

import java.util.*;

/*
2.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ListIterator <Integer> iterator = list.listIterator();
        Random rand = new Random();
        int max = 0;
        int count = 1;

        for (int i = 0; i < 11; i++) {
            iterator.add(rand.nextInt(10)+1);
        }

        iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(count + ": " + iterator.next());
            count++;
        }

        System.out.println("----------------------");

        iterator = list.listIterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if(max < i){
                max = i;
            }
        }
        System.out.println("max collection item is: " + max);
    }
}
