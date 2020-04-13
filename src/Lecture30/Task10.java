package Lecture30;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
10.	Даны два объекта LocalDate из предыдущего задания.
Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task10 {

    LocalDateTime now = LocalDateTime.of(2020, 04, 04, 00,00,00);
    LocalDateTime after = LocalDateTime.of(2020, 06, 25, 00,00,00);

    public long differenceBetweenDatesInSeconds(){


        Duration duration = Duration.between(now, after);
        long diff = ChronoUnit.SECONDS.between(now, after);
        System.out.println("Different between two dates: " + diff + " seconds.");
        return diff;
    }
}
