/*
1. Создать класс, описывающий промежуток времени.
Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
Создать метод для получения полного количества секунд в объекте
Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
Создать метод для вывода данных.
Написать программу для тестирования возможностей класса.
 */
public class Time {
    int hour;
    int min;
    int sec;

    int seconds(){
        return ((hour*60)*60) + (min*60) + sec;
    }

    public Time (int sec){
        this.sec = sec;
    }
    public  Time (int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public static void main(String[] args) {
        Time time1 = new Time(1, 1,1);
        System.out.println("В данном промежутке времени " + time1.seconds() + " секунд.");
        Time time2 = new Time(23847);
        System.out.println("В данном промежутке времени " + time2.seconds() + " секунд.");
    }
}
