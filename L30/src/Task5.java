import java.time.LocalDate;

/*
5.	Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 06, 25);
        System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());
    }
}
