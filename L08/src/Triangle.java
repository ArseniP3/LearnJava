public class Triangle extends Shape {

    @Override
    public String name() {
        return null;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    static class RightTriangle extends Shape implements TritangleInter{
        int katetB;
        int katetA;
        String name = "RightTriangle";

        public RightTriangle(int katetA, int katetB, String name) {
            this.katetA = katetA;
            this.katetB = katetB;
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public double area() {
            return (katetA*katetB)/2;
        }

        public double perimeter() {
            return katetB+katetA;
        }

        @Override
        public String toString() {
            return "Shape is: " + name +". Area: " + area() + ". Perimeter: " + perimeter() + ". Katet: " + katetA + ". katet: " + katetB;
        }
    }

}
