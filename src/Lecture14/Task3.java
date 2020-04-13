package Lecture14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых
есть параметры, например <p id ="p1">,и замену их на простые теги абзацев <p>.
 */
public class Task3 {
    public static void main(String[] args) {

        String tegSorting= "<p align=left>  <p align=right> <p align=center> <p align=justify> <p> " +
                "<p id =sdfsdf> <p sdf =sdfswwe> <p dfsf = sdfsdfsd>";
        String replacementTeg = "<p>";

        Pattern pattern = Pattern.compile("<(.|\\n)*?>");
        Matcher matcher = pattern.matcher(tegSorting);

        String result = matcher.replaceAll(replacementTeg);
        System.out.println(result);
    }
}
