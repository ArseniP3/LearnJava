import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.SECONDS;
/*
9.	Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Создать объект LocalDate, представляющий собой дату 25.06.2020.
Используя созданные объекты, найти количество дней между этими двумя датами.
 */
public class Task9 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate after = LocalDate.of(2020, 06, 25);
        Period period = Period.between(now, after);
        int days = period.getDays();
        System.out.println("Different between two dates: " + days + " day(s).");
    }
}
