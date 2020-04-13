package Lecture15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль все слова,
для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Task1.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> list =new ArrayList<>();

            while (sc.hasNext()){
                list.add(sc.next());
            }
            int j = 1;
            for (int i =0; i<list.size(); i++){
                String firstWord = list.get(i);
                String secondWord = list.get(j);
                if (j<list.size() -1){j++;}
                if(firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)){
                    System.out.println(firstWord);
                }

            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        }
    }
}
