import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Задан файл с java-кодом.
Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */
public class Task7 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E:\\Обучение JAVA\\LearnJava\\L15\\src\\Reeedero.java");
            String s = "";
            int cr;
            while ((cr = file.read()) != -1) {
                s += Character.toString((char) cr);
            }
            StringBuilder builder = new StringBuilder(s);
            System.out.println(builder.reverse());
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
