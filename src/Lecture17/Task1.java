package Lecture17;

import java.util.ArrayList;
import java.util.List;

/*
Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */
public class Task1 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(455);
        list.add(45);
        list.add(11);
        list.add(75);
        list.add(8);
        list.add(45);
        list.add(96);
        list.add(71);
        list.add(65);

        long result = list.stream().filter((number) -> number % 2 != 0 && number % 5 ==0).mapToLong(e -> e).sum();
        System.out.println(result);

    }



}
