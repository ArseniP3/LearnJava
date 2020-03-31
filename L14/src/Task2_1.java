import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записанных по правилам Java, с помощью регулярных выражений и выводящую их на страницу.
 */
public class Task2_1 {
    public static void main(String[] args) {
        String lineOfNumbers = "Decimal examples: 11, 1, 32, 43, 14." +
                "Binary examples: 0b1101, 0b1111. " +
                "Hexadecimal examples: 0x145D, 0X146C, 0XAC111, 0x1BD";
        Pattern pattern = Pattern.compile("(0x|0X)[a-dA-d0-9]{1,5}");
        Matcher matcher = pattern.matcher(lineOfNumbers);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }


}