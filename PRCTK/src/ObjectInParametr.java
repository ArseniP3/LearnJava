public class ObjectInParametr {
    int a;
    int b;

    ObjectInParametr (int i, int j){
        a = i;
        b = j;
    }
    boolean equals (ObjectInParametr obj){
        if (obj.a == a && obj.b == b) return true;
        else return false;
    }
}
class ObjectTest{
    public static void main(String[] args) {
        ObjectInParametr ob1 = new ObjectInParametr(111, 22);
        ObjectInParametr ob2 = new ObjectInParametr(111, 22);
        ObjectInParametr ob3 = new ObjectInParametr(12, 33);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
    }
}