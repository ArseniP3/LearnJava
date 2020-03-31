class JavaStatic {
    static int a = 99;
    static int b = 88;

    static void show(){
        System.out.println("I'm show a: " + a);
    }
}
class Testor{
    public static void main(String[] args) {
        JavaStatic.show();
        System.out.println("I'm show b: " + JavaStatic.b);
    }
}