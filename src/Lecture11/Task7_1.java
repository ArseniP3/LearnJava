package Lecture11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task7_1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(15);

        Random random = new Random(System.currentTimeMillis());

        for(int i = 0; i < 15; i++) {
            int number = -15 + random.nextInt(30);
            list.add(number);
        }

        for (Integer l : list) {
            System.out.print(l + " ");
        }

        System.out.println();

        int ind = list.size();

        for (int i = 0; i < ind; i++) {
            if (list.get(i) >= 0)
                list.add(list.get(i));
        }
        for (int i = 0; i < ind; i++) {
            if (list.get(i) < 0)
                list.add(list.get(i));
        }

        for (int i = 0; i < ind; i++) {
            list.remove(0);
        }
        for (Integer l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }


    }
