/*
2. Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class Task2 {
    public static void main(String[] args) {
        String s = "java :( java :( java :( java :(";
        System.out.println("Sad string: " + s);
        System.out.println("Funny string: " + s.replace (":(", ":)" ));
    }
}
