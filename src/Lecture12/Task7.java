package Lecture12;

/*
7.	Написать метод, который в 50% случаев бросает исключение.
Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.

 */
public class Task7 {
    public static void main(String[] args) {
        for (int i = 0; i<=5; i++){
            try{
                if (i %2 !=0){
                    throw new ArithmeticException();
                }
            }catch (ArithmeticException o){
                o.printStackTrace();
            }finally {
                System.out.println("the remainder of dividing by two is zero");
            }
        }
    }
}
