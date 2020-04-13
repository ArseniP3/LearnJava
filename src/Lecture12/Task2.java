package Lecture12;

/*
2.	Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */
public class Task2 {
    public static void arrayFilling(){
        double array [] = new double[10];
        int count = 1;
        for (int index = 0; index < 20; index++){
            array[index] = Math.random()*100;

            System.out.println(count + ": " + array[index]);
            count ++;
        }
    }
    public static void main(String[] args) {
        try{
            arrayFilling();
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("You went beyond the length of the array.");
        }

    }

}
