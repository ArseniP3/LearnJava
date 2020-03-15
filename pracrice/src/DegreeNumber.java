public class DegreeNumber {
    static int number(int a, int d) {
        int result = 1;
        for (int i = 1; i <= d; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(number(3, 4)+number(4,4));
    }
}

