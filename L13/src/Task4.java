import java.util.Scanner;

/*
4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество
и возвращающую инициалы в формате "Ф.И.О". Учесть, что входные параметры могут
быть в любом регистре, а результирующая строка должна быть в верхнем.
 */
public class Task4 {

    public static void receivingUserData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firs name: ");
        String firsName = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = sc.nextLine();
    }
    public static void doUpperCaseAdnTakeFirsChar() {



    }

    public static void main(String[] args) {
        receivingUserData();
    }
}