package Lecture03;

/*
4. Создать массив из 3 случайных целых чисел из отрезка [10;99],вывести его на экран в строку.
Определить и вывести на экран сообщение о том,является ли массив строго возрастающей последовательностью.
 */
public class Task4 {
    public static void main(String[] args) {
        int array [] = new int [3];
        int index;
        for (index = 0; index < array.length; index++){
            array[index] = (int) (Math.random() *90+10);
            System.out.print(array[index] + " ");
        }
        System.out.println();
        for (index = 0; index < array.length; index++ ){
            if(index>0){
                if (array[index-1] >= array[index]){
                    System.out.println("Прогрессия не строго возрастающая.");
                    break;
                }
                //if (array[index-1] < array[index]);
                if (index == array.length -1);
                System.out.println("Прогрессия строго возрастающая.");
                break;
            }
        }

    }
}
