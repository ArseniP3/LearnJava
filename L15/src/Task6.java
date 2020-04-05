import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/*
6 Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию
 */
public class Task6 {

        public static void recurs(File[] array,int i,int j) {
            if(i == array.length){
                return;
            }

            if(array[i].isFile()) {
                System.out.println(array[i].getName());

            }else if(array[i].isDirectory()) {
                System.out.println("[" + array[i].getName() + "]");
                recurs(array[i].listFiles(), 0, j + 1);
            }
            recurs(array, ++i, j);
        }

        public static void main(String[] args) {

            String directory1 = "E:\\Обучение JAVA\\LearnJava";
            File directory = new File(directory1);

            if(directory.exists() && directory.isDirectory()) {
                File array[] = directory.listFiles();
                recurs(array,0,0);
            }
        }
}
