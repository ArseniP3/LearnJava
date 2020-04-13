package Lecture04;

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
    int twentyNoteCount;
    int fiftyNoteCount;
    int hundredNoteCount;

    public Atm (int twentyNoteCount, int fiftyNoteCount, int hundredNoteCount){
        this.twentyNoteCount = twentyNoteCount;
        this.fiftyNoteCount = fiftyNoteCount;
        this.hundredNoteCount = hundredNoteCount;
    }
    public int addTwenty(){
       int sum = twentyNoteCount * 20;
        System.out.println("Вы добавили в банкомат " + twentyNoteCount + " двадцатирублёвых купюр.");
        return sum;
    }
    public int addFifty(){
        int sum = fiftyNoteCount * 50;
        System.out.println("Вы добавили в банкомат " + fiftyNoteCount + " пятидесятирублёвых купюр." );
        return sum;
    }
    public int addHundred(){
        int sum = hundredNoteCount * 50;
        System.out.println("Вы добавили в банкомат " + hundredNoteCount + " сторублёвых купюр." );
        return sum;
    }
    public int allMoney(){
        int sum = addTwenty()+addFifty()+addHundred();
        System.out.println("В банкомате: " + sum + " рублей.");
        return sum;
    }
    public boolean isAvalibleAmount (int amount){
        boolean b = amount % 20 != 0 || amount % 50 != 0 || amount % 70 != 0 || amount % 90 != 0 || amount % 110 != 0 || amount % 130 != 0;
        if ((amount>allMoney()) & b){
            System.out.println("В банкомате нет необходимой суммы. В банкомате нет купюр необходимого номинала.");
        }else if (amount>allMoney()){
            System.out.println("В банкомате нет необходимой суммы.");
        }else if (b){
            System.out.println("В банокмате нет купюр необходимого номинала.");
        }else {
            System.out.println("Операция одобрена, ожидаете выдачи наличных.");
        }
        return true;
    }

    public static int checkScannerIntNumberNew(Scanner sc1, String invitation) {
        int intNumber = 0;

        do {
            System.out.print(invitation);
            intNumber = sc1.nextInt();
        }
        while (intNumber < 0);
        return intNumber;
    }
    static Atm pushToAtm() {
        Scanner sc = new Scanner(System.in);
        int usd20 = checkScannerIntNumberNew(sc, "Input amount of 20$ banknotes:\t");
        int usd50 = checkScannerIntNumberNew(sc, "Input amount of 50$ banknotes:\t");
        int usd100 = checkScannerIntNumberNew(sc, "Input amount of 100$ banknotes:\t");
        Atm atmMachine = new Atm(usd20, usd50, usd100);
        return atmMachine;

    }

    public static void main(String[] args) {
        Atm atm = new Atm(2000, 500, 300);
        atm.isAvalibleAmount(110);
    }
}
