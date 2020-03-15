public class BigBox {
    double width;
    double height;
    double depth;

    BigBox (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }

    static class BogBoxx{
        public static void main(String[] args) {
            BigBox mybox1 = new BigBox(12, 15, 54);
            BigBox mybox2 = new BigBox(12, 45, 8);
            System.out.println(mybox1.volume());
            System.out.println(mybox2.volume());



        }
    }
}
