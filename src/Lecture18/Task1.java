package Lecture18;

/*
Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и суммировать каждый четный элемент кратный 3.
На каждой итерации, кратной 1 000 000, поток должен заснуть на 10мс. Вместе с суммирующим потоком запустить поток демон,
который каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов.
 */
public class Task1 extends Thread {

    public static long sum;

    @Override
    public void run() {
        for (int i = 1; i <= 10_000_000; i++){
            if(i % 3 == 0 & i % 2 == 0 ){
                sum +=i;
            }
            try {
                if (i % 1_000_000 == 0){
                    sleep(10);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static long getSum(){
        return sum;
    }
}

class Deamon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Task1.getSum());
        }
    }

}



class Program{
    public static void main(String[] args) {
        Task1 t = new Task1();
        Deamon d = new Deamon();

        d.setDaemon(true);
        t.start();
        d.start();


    }
}
