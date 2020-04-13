package Lecture15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

 */
public class Task4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Task1.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> list = new ArrayList<>();
            ListIterator<String> iterator;

            while (sc.hasNext()){
                String number = sc.next();
                boolean result = number.matches("[0-9]+");
                if (result == true){
                    list.add(number);
                }
            }

            int largestString = list.get(0).length();
            int index = 0;

            for(int i = 0; i < list.size(); i++) {
                if(list.get(i).length() > largestString) {
                    largestString = list.get(i).length();
                    index = i;
                }
            }
            System.out.println( list.get(index) + " " + "is the largest and is size ");
            System.out.println("===================================");

            iterator = list.listIterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
