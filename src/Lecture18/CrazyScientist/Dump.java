package Lecture18.CrazyScientist;

import java.util.HashMap;
import java.util.Map;

public class Dump {
    Map<String, Integer> map = new HashMap<>();

    public synchronized void putDet (Map<String, Integer> m) {
        map.putAll(m);
        System.out.println(m);
    }

    public synchronized void popDet (Map<String, Integer> m) {
        if(!map.isEmpty()) {

            for (String string : map.keySet()) {

                if (m.containsKey(string)) {
                    m.put(string, m.get(string) + 1);
                } else {
                    m.put(string, map.get(string));
                }
            }
        }
    }
}
