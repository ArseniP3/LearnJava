package Lecture09;

/*
2.	Создать статический обобщённый метод swap в final классе PairUtil.
Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.
 */
public final class Task2_PairUtil {

    public static <K, V> Task1_Pair <V, K> change(Task1_Pair<K, V> obj) {
        return new Task1_Pair<>(obj.getV(), obj.getK());
    }

}
