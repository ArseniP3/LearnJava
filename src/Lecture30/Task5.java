package Lecture30;

import java.time.LocalDate;

/*
5.	Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
 */
public class Task5 {

    public String doLocalDate(){
        LocalDate date = LocalDate.of(2020, 06, 25);
        String s = date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear();
        System.out.println(s);
        return s;
    }
}
