package Lecture14;

import java.util.Scanner;

/*
1. Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом
оно должно начинаться с буквы. Возможные домены верхнего уровня: .org .com
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your e-mail address: ");
        Scanner sc = new Scanner(System.in);
        String userMail = sc.nextLine();
        boolean result = userMail.matches("\\w+@[a-zA-Z]\\w+.(com|org)");
        if (result == true){
            System.out.println("You entered the correct email.");
        }else {
            System.out.println("Ypu entered an invalid email.");
        }
    }
}
