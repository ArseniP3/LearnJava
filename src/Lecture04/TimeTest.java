package Lecture04;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time(1, 1,1);
        System.out.println("В данном промежутке времени " + time1.seconds() + " секунд.");
        Time time2 = new Time(23847);
        System.out.println("В данном промежутке времени " + time2.seconds() + " секунд.");
    }
}
