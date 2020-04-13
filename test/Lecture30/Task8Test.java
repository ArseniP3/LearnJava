package Lecture30;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task8Test {

    @Test(expected = DateTimeParseException.class)
    public void LocalDateFromStringTestException03() {

        String textDate = "26-23-2014";
        LocalDate parsedDate = LocalDate.parse(textDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
