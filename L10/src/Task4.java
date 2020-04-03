import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
•	Задать размер стека.
•	Внести цифру в стек.
•	Извлечь цифру из стека.
Вывести число, у которого цифры идут в обратном порядке.
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter the number you want to push onto the keyboard.");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int length = word.length();
        char ch;
        ArrayList<Object> stack = new ArrayList<>();
        ListIterator<Object> iterator;

        iterator = stack.listIterator();
        boolean result = word.matches("[0-9]+");
        if (result == true){
            for (int i = 0; i<length; i++){
                ch = word.charAt(i);
                iterator.add(ch);
            }
        }else {
            System.out.println("You did not enter an integer");
        }

        iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        while (iterator.hasNext()){
            System.out.print(iterator.previous() + "  ");
        }
    }

}
