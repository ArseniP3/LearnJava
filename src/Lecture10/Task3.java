package Lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/*
3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListIterator<String> iterator;
        list.add("Veronika");
        list.add("John");
        list.add("Ivan");
        list.add("Irina");
        list.add("Petr");
        list.add("Arseni");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }

        System.out.println(" ");
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println(" ");

        iterator = list.listIterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element + "  ");
        }
        System.out.println(" ");
        while (iterator.hasPrevious()){
            String element = iterator.previous();
            System.out.print(element + "  ");
        }
    }
}
