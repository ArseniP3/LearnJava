public class Test1 {
    int fact (int n){
        int result;
        
        if (n == 1){ return 1; }
        result = fact(n-1 ) * n;
        return result;
    }
}
class Teso{
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println("Factorial of the number is " + test.fact(11));


            }
}