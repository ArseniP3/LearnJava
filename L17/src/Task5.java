/*
5.	Дан класс Person с полями firstName, lastName, age.
Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;


public class Task5 {
    private String firstName;
    private String lastName;
    private int age;

    public Task5(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String firstName() { return firstName;}
    public String lastName() { return lastName;}
    public int getAge() {return age;}

    public String toString() {
        return firstName + " - " + lastName + " - " + age;
    }


    public static void main(String[] args) {
        Task5 t1 = new Task5("Вадим", "Вадимов", 28);
        Task5 t2 = new Task5("Олег", "Олегов", 29);
        Task5 t3 = new Task5("Иван", "Иванов", 30);
        Task5 t4 = new Task5("Виктор", "Викторович", 31);
        Task5 t5 = new Task5("Дмитрий", "Дмитров", 32);

        List<Task5> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);


        Task5 finishVariable = list.stream().filter(person -> person.firstName().length() < 15 && person.firstName().length() < 15)
                .reduce(BinaryOperator.maxBy(Comparator.comparing(Task5::getAge))).orElseThrow(IllegalArgumentException::new);
        System.out.println(finishVariable);
    }
}

