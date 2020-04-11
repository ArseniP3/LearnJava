import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        try {
            FileReader file = new FileReader("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Task1.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        }
    }
}
