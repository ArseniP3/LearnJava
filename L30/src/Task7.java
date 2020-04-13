import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
7.	Создать объект LocalDate, представляющий собой сегодняшнюю дату.
Преобразовать дату в строку вида "05.05.2017".
Вывести эту строку в консоль
 */
public class Task7 {

    public void dateToString(){
        LocalDate date = LocalDate.now();
        System.out.println("Date before formatting: " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String s = date.format(formatter);
        System.out.println("Date after formatting:" + s);
    }
}
