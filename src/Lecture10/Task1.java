package Lecture10;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/*
1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListIterator<Integer> iterator = list.listIterator();
        int negativeMark = 4;
        int count = 1;

        Random rnd = new Random();

        for (int i = 0; i < 28; i++) {
            iterator.add(rnd.nextInt(10) + 1);
        }

        iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= negativeMark) iterator.remove();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Student number " + count + " = " + list.get(i));
            count++;
        }
    }
}
