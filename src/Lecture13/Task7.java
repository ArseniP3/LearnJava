package Lecture13;

/*
7. Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов,
дополненных слева нулями. Если число выходит за размер 10 символов вернуть все нули.

Пример getString(22) -> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ.
 */
public class Task7 {

    public static void getString(long i){
        if (i<=9_999_999_999l) {
            System.out.printf("I = %010d", i);
        }else {
            System.out.println("I = 0000000000");
        }
    }

    public static void main(String[] args) {
        getString(222000000000l);

    }
}
