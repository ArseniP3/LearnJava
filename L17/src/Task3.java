import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
3.	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
public class Task3 {
    public static void main(String[] args) {
        int i = 0;
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("11111111111111", 10);
        map1.put("qqqqqqqqqqqqqq", 10);
        map1.put("wwww1", 5);
        map1.put("wwww", 5);
        map1.put("wwwwwwww", 10);
        map1.put("wwwwww", 5);

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String s = entry.getKey();
            int b = entry.getValue();
            if (s.length()<7){
                i+=b;
            }
        }
        System.out.println(i);

    }
}
