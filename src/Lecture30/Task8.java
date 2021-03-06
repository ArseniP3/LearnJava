package Lecture30;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
8.	Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
 */
public class Task8 {
    String dateText = "26-03-2014" ;
    DateTimeFormatter formatter;

    public LocalDate makeDateFromString(){
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateText, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(date.format(formatter));
        return date;
    }


}
