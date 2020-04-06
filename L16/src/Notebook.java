import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.

 */
public class Notebook extends Computer {

    String touchpad;
    transient double weight;


    public Notebook(int ozu, int hddMemory, String nameOfVideoController, String touchpad, double weight) {
        super(ozu, hddMemory, nameOfVideoController);
        this.touchpad = touchpad;
        this.weight = weight;
    }


    public static void deserealiz(Object o) throws IOException, ClassNotFoundException {
        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("E:\\Обучение JAVA\\LearnJava\\L16\\" + o + ".dat"));
        Notebook notebook = (Notebook) ooi.readObject();
        System.out.println("OZU: " + notebook.ozu);
        System.out.println("HDD: " + notebook.hddMemory);
        System.out.println("Videocontroller: " + notebook.nameOfVideoController);
        System.out.println("Tuchpad: " + notebook.touchpad);
        System.out.println("Weight : " + notebook.weight);
        System.out.println();
    }





    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Notebook notebook = new Notebook(4, 320, "Palit LE", "Grey", 2.35);
        Notebook mas = new Notebook(16, 1000, "Gringo", "White", 3.999);
        serializ(notebook);
        deserealiz(notebook);

        serializ(mas);
        deserealiz(mas);

    }
}
