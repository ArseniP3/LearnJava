package Lecture15;

import java.io.*;
import java.util.Random;

/*
Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class Task5 {
    public static void main(String[] args) {
        File file = new File("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Task5.txt");
        Random random = new Random();
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

            for (int i = 0; i<=20; i++){
                int j = random.nextInt(999999999)+255;
                dos.writeInt(j);
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(DataInputStream dos = new DataInputStream(new FileInputStream(file)))
        {
            int sum=0;
            for (int i = 0; i<=20; i++){
                int j = dos.readInt();
                sum += j;
            }
            int k = sum/20;
            System.out.println(k);


    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
