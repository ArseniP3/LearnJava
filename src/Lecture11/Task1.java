package Lecture11;

import java.util.*;

/*
Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество уникальных целых чисел в этом списке.
При получении пустого списка метод должен возвращать 0.
 */
public class Task1 {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(8);
        list.add(8);
        list.add(7);
        list.add(5);
        list.add(6);
        list.add(6);

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

        if(set.isEmpty()){
            System.out.println("0");
        }else {
        System.out.println(set.size());
        }
    }
}
