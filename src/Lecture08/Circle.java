package Lecture08;

public class Circle extends Shape implements TritangleInter{

    double radius;

    static final double PI = 3.1415;
    static final String NAME = "Lecture08.Circle";


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public double area() {
        return PI*(radius*radius);
    }

    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Lecture08.Shape is: " + name() +". Area: " + area() + ". Perimeter: " + perimeter() + ". Radius: " +radius;
    }
}
