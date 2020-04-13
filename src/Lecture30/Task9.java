package Lecture30;



import java.time.LocalDate;
import java.time.Period;

/*
9.	Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Создать объект LocalDate, представляющий собой дату 25.06.2020.
Используя созданные объекты, найти количество дней между этими двумя датами.
 */
public class Task9 {
    int days;
    LocalDate now = LocalDate.now();
    LocalDate after = LocalDate.of(2020, 06, 27);

    public int differenceBetweenDates(){
        Period period = Period.between(now, after);
        days = period.getDays();
        System.out.println("Different between two dates: " + days + " day(s).");
        return days;
    }
}
