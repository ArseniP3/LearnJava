package Lecture16;

import java.io.*;

/*
2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
Десериализовать объект из того же файла, вывести значения полей в консоль.

 */
public class Computer implements Serializable {
    int ozu;
    int hddMemory;
    String nameOfVideoController;

    public Computer(int ozu, int hddMemory, String nameOfVideoController) {
        this.ozu = ozu;
        this.hddMemory = hddMemory;
        this.nameOfVideoController = nameOfVideoController;
    }

    public static void serializ (Object o) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Обучение JAVA\\LearnJava\\L16\\" + o + ".dat"));
        oos.writeObject(o);
        oos.close();
    }

    public static void deserealiz (Object o) throws IOException, ClassNotFoundException {
        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("E:\\Обучение JAVA\\LearnJava\\L16\\" + o + ".dat"));
        Computer computer = (Computer)ooi.readObject();
        System.out.println("OZU: " + computer.ozu);
        System.out.println("HDD: " + computer.hddMemory);
        System.out.println("Videocontroller: " + computer.nameOfVideoController);
        System.out.println();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer(6, 500, "Nvidia gts 000");
        Computer mac = new Computer(99, 99999, "Groberstaid");

        serializ(computer);
        deserealiz(computer);

        serializ(mac);
        deserealiz(mac);
    }
}
