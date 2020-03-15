import java.util.Scanner;

/*
2. Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -
успешность выполнения операции.
При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Atm {
    int twenty = 20;
    int fifty = 50;
    int hundred = 100;

    public static int addTwenty (int twenty){
        int sumTwenty = 20 * twenty;
        System.out.println("Вы добавили в банкомат " + twenty+ " двадцатирублёвых купюр.");
        return sumTwenty;
    }
    public static int addFifty (int fifty){
        int sumFifty = 50 * fifty;
        System.out.println("Вы добавили в банкомат " + fifty+ " двадцатирублёвых купюр.");
        return sumFifty;
    }
    public static int addHundred (int hundred){
        int sumHundred = 100 * hundred;
        System.out.println("Вы добавили в банкомат " + hundred+ " двадцатирублёвых купюр.");
        return sumHundred;
    }
    public static int allMoney(){
        int sum = addTwenty(555) + addFifty(333) + addHundred(111);
        System.out.println("Доступная сумма в банкомате: " + sum + " рублей.");
        return sum;
    }


    public static int takeCash(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму, которую хотите снять со счёта: ");
        int money = sc.nextInt();
        if(money %20 == 0 & money <= allMoney()){
            System.out.println("Транзакция одобрена, ожидайте выдачи наличных.");

        }else if (money %20 !=0){
            System.out.println("Вы ввели сумму не кратную 20ти");
        }else if(money>= allMoney()){
            System.out.println("В банкомате нет столько денег.");
        }
        return money;
    }

    public static void main(String[] args) {
        allMoney();
        takeCash();

    }
}
