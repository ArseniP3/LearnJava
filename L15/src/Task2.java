import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Task1.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                String s = sc.next();
                boolean result = s.matches("\\b[eEyYuUiIoOaAjJ]\\w*");
                if (result == true){
                System.out.print(s +" | ");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        }
    }
}
