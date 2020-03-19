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
    public static int allMoneyInAtm(){
        int sum = addTwenty(555) + addFifty(333) + addHundred(111);
        System.out.println("Доступная сумма в банкомате: " + sum + " рублей.");
        return sum;
    }
    public static int determinationOfAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите снять со счёта: ");
        int takeNoney = sc.nextInt();
        return takeNoney;
    }
    public static boolean operationSuccess(){
        if (determinationOfAmount()>allMoneyInAtm() & determinationOfAmount() %20 !=0){
            System.out.println("В банкомете нет необходимой суммы. В банкомате нет купюр номиналом меньше 20 рублей.");
            return false;
        }else if (determinationOfAmount()>allMoneyInAtm()){
            System.out.println("В банкомате нет необходимой суммы.");
            return false;
        }else if (determinationOfAmount() %20 !=0){
            System.out.println("В банкомате нет купюр номиналом меньше 20 рублей.");
            return false;
        }else {
            System.out.println("Транзакция одобрена, ожидайте выдачи наличных.");
            return true;
        }
    }


    public static void main(String[] args) {
        allMoneyInAtm();
        determinationOfAmount();
        operationSuccess();



    }
}
