import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4. Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона

 */
public class Task4 {
    public static void main(String[] args) {
        String searchPhoneNumbers = "+375256160099zxc+333338488zxxzz+39416689954+638598986489+3752966287445525+375291111111" +
                "+375333759999sdffsdfsdfqfsdfsdfsdfsdfzcsd+3752998449844fsdfsdf+37533sdfdfsdfsdfsdf+6448549494949sdfsdfsd" +
                "+3754487965645455455sdfsdfsdfsd+37534533338585+375296984548599+375289996655+333335548494+89494949+54848ZX";
        Pattern pattern = Pattern.compile("(\\+375)(29|33|44|25)(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(searchPhoneNumbers);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            stringBuilder
                    .append(" ")
                    .append(matcher.group(1))
                    .append("(")
                    .append(matcher.group(2))
                    .append(")")
                    .append(matcher.group(3))
                    .append("-")
                    .append(matcher.group(4))
                    .append("-")
                    .append(matcher.group(5))
                    .append("\n");
        }
        System.out.println(stringBuilder);

    }

}
