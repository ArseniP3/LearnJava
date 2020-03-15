import java.util.Scanner;

public class Abro {
    public static void main(String[] args) {
        String answer;
        boolean exit;
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner sc = new Scanner(System.in);
        exit = false;
        for (int i=1; i <= 3; i++ ){
            if(exit==true)
                break;
            answer = sc.nextLine();
            switch (answer){
                case ("троллейбус") : System.out.println("Молодец, это правильный ответ!");
                exit = true;
                break;
                case  ("не знаю") : System.out.println("троллейбус");
                exit = true;
                break;
                default : System.out.println("Подумай еще");
            }
        }
    }
}