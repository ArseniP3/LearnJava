import java.util.logging.SocketHandler;

public class Arguments {
    int a;
    int b;

    Arguments(int a, int b){
        this.a = a;
        this.b = b;
    }
    void meth(Arguments o){
        a *= 2;
        b /= 2;
    }
}
class callBy{
    public static void main(String[] args) {
        Arguments obj = new Arguments(15, 20);
        Arguments obekto = new Arguments(66, 989);
        System.out.println("a & b перед изменинием: "+ obj.a + " " + obj.b);
        obj.meth(obj);
        obekto.meth(obekto);
        System.out.println("a & b после изменения: "+ obj.a + " " + obj.b);
        System.out.println(obekto.a + " " + obekto.b);


    }
}