package Lecture14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
5. Написать метод, который проверяет, является ли строка адресом IPv4.
Пример корректных IPv4
0.0.0.0
0.0.1.0
255.0.0.1
255.55.255.255
192.168.0.1

Не корректный
001.0.0.0
256.1.1.1
1.1.1.1.
-1.0.-1.1
 */
public class Task5 {
    public static void main(String[] args) {
        String ipAddressSort = "111.1.12.55 192.168.0.1 255.55.255.255 0.0.1.0 0.2.3.6 0.45.55.65 1113.414.554.4 020.222.115.0550...01.02.03.04 ";
        Pattern pattern = Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|[1]?[1-9]?[0-9])\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?=\\s|$)");
        Matcher matcher = pattern.matcher(ipAddressSort);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
