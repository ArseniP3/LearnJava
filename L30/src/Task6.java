import java.time.LocalDate;

/*
6.	Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Используя этот объект, создать другой объект LocalTime, представляющий собой дату через 3 месяца после сегодняшней.
Вывести эту дату в консоль.
 */
public class Task6 {

    public void todayPlusThreeMonth(){
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusMonths(3);
        System.out.println(date1);
    }
}
