package Lecture30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
7.	Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Преобразовать дату в строку вида "05.05.2017".
Вывести эту строку в консоль
 */
public class Task7 {

    LocalDate date = LocalDate.now();

    public String dateToString(){

        System.out.println("Date before formatting: " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String s = date.format(formatter);
        System.out.println("Date after formatting:" + s);
        return s;
    }
}
