class OverloadDemo {
    void test(){
        System.out.println("У метода нету параметров.");
    }
    void test(int a){
        System.out.println("у метода есть параметр: " + a);
    }
    void test(int a, int b){
        System.out.println("у метода есть параметры: " + a + " " + b);
    }
    void test(int a, int b, int c){
        System.out.println("у метода есть параметры: " + a + " " + b + " " + c);
    }
    double test (double a, double b, double c){
        System.out.println("у метода есть параметры: " + a + " " + b + " " + c);
        return a*b*c;
    }
}

class Overload{
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        double result;

        obj.test();
        obj.test(6546);
        obj.test(6878, 546);
        obj.test(97, 87, 7);
        obj.test(2323.23, 2323.54, 2.234);
        result = obj.test(2323.23, 2323.54, 2.234);
        System.out.println(result);
    }
}
