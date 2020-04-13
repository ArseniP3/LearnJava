package Lecture11;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/*
5.	Определить множество на основе множества целых чисел.
Создать методы для определения пересечения и объединения множеств.
 */
public class Task5_1 {

    HashSet<Integer> set = new HashSet<Integer>();
    {set.add(1); set.add(2); set.add(3); set.add(4); set.add(5);}

    HashSet<Integer> set1 = new HashSet<>();
    {set1.add(3); set1.add(4); set1.add(5); set1.add(6); set1.add(7);}

    public Set union(Set set1, Set set2){
        set1.addAll(set2);
        return set1;
    }

    public Set intersect(Set set1, Set set2) {
        set1.retainAll(set2);
        return set1;
    }

    public  void main(String[] args) {
        union(set,set1);
        intersect(set, set1);
    }
}
