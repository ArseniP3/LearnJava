import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner wor = new Scanner(System.in);
        System.out.println("Веведите два слова с клавиатуры: ");
        String wor1 = wor.nextLine();
        String wor2 = wor.nextLine();
        int len1 = wor1.length();
        int len2 = wor2.length();
        if(wor1.equals(wor2)) {
            System.out.println("Отлично! Слова одинаковые.");
        }
        else if (wor1.equalsIgnoreCase(wor2)) {
            System.out.println("Хорошо. Почти одинаковы");
        }
        else if (len1 == len2 ){
            System.out.println("Ну, хотябы одинаковой длины.");
        }
        else {
            System.out.println("Эхх... Слова разные");
        }
    }
}
