import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
4.	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
Пример: список {5, 2, 4, 2, 1}
Результирующая строка: "52421"

 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(455);
        list.add(45);
        list.add(11);
        list.add(75);
        list.add(8);
        list.add(45);
        list.add(96);
        list.add(71);
        list.add(65);

        List<String> string = list.stream().map(Object::toString).collect(Collectors.toList());

        String s = String.join("", string);
        System.out.println(s);
    }
}
