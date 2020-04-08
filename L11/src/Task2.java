import java.util.*;

/*
Написать метод isUnique, который принимает Map<String, String> и возвращает true,
если два различных ключа не соответствуют двум одинаковым значениям.
Например, в данном случае вернётся:

 true:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

А в данном - false:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */
public class Task2 {

    public  boolean isUnique(HashMap<String, String> collections){
        List<String> list = new ArrayList<>();
        Set <String> set = new HashSet<>();
        ListIterator<String> iterator;


        for (Map.Entry<String, String> entry : collections.entrySet()) {
             String s = entry.getValue();
             list.add(s);
        }


        set.addAll(list);

        if(list.size()==set.size()){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

        HashMap <String, String> m1 = new HashMap<>();
        m1.put("Marty", "Er");
        m1.put("Stuart", "Reges");
        m1.put("Jessica", "Miller");
        m1.put("Amanda", "Camp");
        m1.put("Hal", "Step");

        HashMap <String, String> m2 = new HashMap<>();
        m2.put("Kendrick", "Perkins");
        m2.put("Stuart", "Reges");
        m2.put("Jessica", "Miller");
        m2.put("Bruce", "Reges");
        m2.put("Hal", "Perkins");

        Task2 task = new Task2();
        System.out.println(task.isUnique(m1));
        System.out.println(task.isUnique(m2));


    }
}
