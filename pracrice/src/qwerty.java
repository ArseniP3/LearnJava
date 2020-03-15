

/*
План по захвату мира
*/

import java.util.Scanner;

class qwery {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год с клавиатуры: ");
        int age = sc.nextInt();
        Scanner scc = new Scanner(System.in);
        System.out.print("Введите имя с клавиатуры: ");
        String name = scc.nextLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}