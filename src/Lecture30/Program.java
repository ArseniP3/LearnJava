package Lecture30;

public class Program {


    public static void main(String[] args) {
        System.out.println("Lecture13.Task5");
        Task5 task5 = new Task5();
        task5.doLocalDate();

        System.out.println("----------------------------");
        System.out.println("Lecture30.Lecture13.Task6");

        Task6 task6 = new Task6();
        task6.todayPlusThreeMonth();

        System.out.println("----------------------------");
        System.out.println("Lecture30.Lecture13.Task7");

        Task7 task7 = new Task7();
        task7.dateToString();

        System.out.println("----------------------------");
        System.out.println("Lecture30.Task8");

        Task8 task8 = new Task8();
        task8.makeDateFromString();

        System.out.println("----------------------------");
        System.out.println("Lecture30.Task9");

        Task9 task9 = new Task9();
        task9.differenceBetweenDates();

        System.out.println("----------------------------");
        System.out.println("Lecture30.Task10");

        Task10 task10 = new Task10();
        task10.differenceBetweenDatesInSeconds();

        System.out.println("----------------------------");



    }
}
