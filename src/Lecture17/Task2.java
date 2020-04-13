package Lecture17;

import java.util.HashSet;
import java.util.Set;

/*
2.	Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */
public class Task2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Qwerty");
        set.add("Vrowlerrrr");
        set.add("R23233242342");
        set.add("oewhgiwehipgeprgh  hopehrfshhopehrfsh");
        set.add("1234");
        set.add("1234");
        set.add("123456789");
        set.add("dfpjgdp[sdj  fsdf");

        long count = set.stream().filter(s -> s.length() > 8).distinct().count();
        System.out.println(count);
    }

}
