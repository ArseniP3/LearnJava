public class Rectangle extends Shape implements TritangleInter {

    static final String NAME = "Rectangle";

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public double area() {
        return sideA*sideB;
    }


    public double perimeter() {
        return (sideB+sideA)*2;
    }

    @Override
    public String toString() {
        return "Shape is: " + NAME +". Area: " + area() + ". Perimeter: " + perimeter() + ". SideA: " + sideA + ". SideB: " + sideB;
    }

    static class Square extends Shape implements TritangleInter{

        String name = "Square";
        int side;

        public Square(String name, int side) {
            this.name = name;
            this.side = side;
        }

        public Square(int side) {
            this.side = side;
        }

        @Override
        public String name() {
            return this.name;
        }

        @Override
        public double area() {
            return side*side;
        }

        public double perimeter() {
            return 2*(side+side);
        }

        @Override
        public String toString() {
            return "Shape is: " + name +". Area: " + area() + ". Perimeter: " + perimeter() + ". Side: " + side;
        }
    }
}
