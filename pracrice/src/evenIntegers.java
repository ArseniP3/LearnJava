public class evenIntegers {
    public static boolean eve(int a){
        if (a % 2 !=0){
            return false;
        }else {
            return true;
        }
    }
    public static boolean ero (int a){
        return (a%2==0);
    }

    public static void main(String[] args) {
        System.out.println(ero(5));
        System.out.println(ero(10));
        System.out.println(ero(11));
        System.out.println(eve(12));
        System.out.println(eve(14));
        System.out.println(eve(15));
    }
}
