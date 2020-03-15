import java.util.Scanner;

public class Min {


    public static int minNumber (int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        System.out.println(minNumber(123,123123));
    }
}
