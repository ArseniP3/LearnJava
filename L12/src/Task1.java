/*
1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
Отловите возникшее исключение.
*/
public class Task1 {
    public static void main(String[] args) {
        //String s = null;
        try{
            String s = null;
            s.charAt(2);
        }catch (Exception o){
            System.out.println("You did not initialize variable.");
        }
    }
}
