import java.time.LocalDate;

/*
5.	Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
 */
public class Task5 {

    public void doLocalDate(int year, int month, int day ){
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());
    }
}
