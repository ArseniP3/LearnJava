package Lecture13;/*
1. Написать два цикла, выполняющих многократное сложение строк, один с помощью
оператора сложения и String, второй с помощью StringBuilder и метода append.
Сравнить скорость их выполнения.2
 */

public class Task1 {

    static void additionWithoutStringBuilder(int numberOfOperations){
        String s = "Boom!";
        String s1 = "Java ";
        for (int i = 0; i <=numberOfOperations ; i++){
            String s2 = s1+s;
        }
    }
    static void additionWithStringBuilder(int numberOfOperations){
        StringBuilder builder = new StringBuilder("Java ");
        for (int i = 0; i <= numberOfOperations; i++){
            builder.append("Boom!");
        }
    }

    public static void main(String[] args) {

        long time = System.nanoTime();
        additionWithoutStringBuilder(10000);
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);

        long time1 = System.nanoTime();
        additionWithStringBuilder(10000);
        time1 = System.nanoTime() - time1;
        System.out.printf("Elapsed %,9.3f ms\n", time1/1_000_000.0);

    }
}
