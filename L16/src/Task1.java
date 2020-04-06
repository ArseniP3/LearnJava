import java.io.*;

/*
Сравнить скорость чтения и записи 5 МБ символов при использовании классов
буфиризированого и не буфиризированого символьного ввода вывода.
 */
public class Task1 {
    public static void writeAndReadNotBuffer(String nameFile) throws IOException {


        long time = System.nanoTime();

        FileWriter writer = new FileWriter("E:\\Обучение JAVA\\LearnJava\\" + nameFile + ".txt");
        for (int i = 0; i <= 5_000_000; i++) {
            writer.append('w');
        }
        time = System.nanoTime() - time;
        System.out.printf("Write without buffering: %,9.3f ms\n", time/1_000_000.0);

        long time1 = System.nanoTime();
        FileReader reader = new FileReader("E:\\Обучение JAVA\\LearnJava\\" + nameFile + ".txt");
        int c;
        while ((c=reader.read())!=-1){
        }
        time1 = System.nanoTime() - time1;
        System.out.printf("Read without buffering: %,9.3f ms\n", time1/1_000_000.0);
    }

    public static void writeAndReadWithBuffer(String nameFile) throws IOException {

        long time2 = System.nanoTime();
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Обучение JAVA\\LearnJava\\" + nameFile + ".txt"));
        for (int i = 0; i <= 5_000_000; i++) {
            bw.append('w');
        }
        time2 = System.nanoTime() - time2;
        System.out.printf("Write with buffering: %,9.3f ms\n", time2/1_000_000.0);


        long time3 = System.nanoTime();
        BufferedReader br = new BufferedReader(new FileReader("E:\\Обучение JAVA\\LearnJava\\" + nameFile + ".txt"));
        int c;
        while ((c=br.read())!=-1){
        }
        time3 = System.nanoTime() - time3;
        System.out.printf("Read with buffering: %,9.3f ms\n", time3/1_000_000.0);
    }



    public static void main(String[] args) throws IOException {
        writeAndReadNotBuffer("NotBuffer");
        writeAndReadWithBuffer("WithBuffer");


    }
}