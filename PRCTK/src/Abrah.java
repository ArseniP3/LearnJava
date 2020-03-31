class Abrah {
    int j;
    int i;
    void showij(){
        System.out.println("i & j class abrah: " + i + " " + j);
    }
}
class Bbrah extends Abrah{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("Sum of i+j+k " + ( i + j + k));
    }
}
class WorkProgramm{
    public static void main(String[] args) {
        Abrah a = new Abrah();
        Bbrah b = new Bbrah();
        a.i = 10;
        a.j = 11;
        a.showij();

        b.j = 111;
        b.i = 1111;
        b.k = 110;
        b.showij();
        b.showk();
        b.sum();

    }
}