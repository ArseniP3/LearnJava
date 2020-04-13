package Lecture11;

import java.util.*;

/*
Реализовать структуру «Черный ящик» хранящую целые числа.
Структура должна поддерживать операции добавления числа и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */
public class Task4 {

    public void addNum(Set<Integer> set, Integer number){
        set.add(number);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(15);

        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < 15; i++) {
            int number = -15 + random.nextInt(30);
            set1.add(number);
        }

        Task4 task4 = new Task4();
        task4.addNum(set1, 45);
    }
}
