package Lecture08;

public class ShapeUtils {

    public static boolean isRectaangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4564);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(112, 11);
        System.out.println(rectangle.toString());

        Rectangle.Square square = new Rectangle.Square(45);
        System.out.println(square.toString());

        Triangle.RightTriangle rt = new Triangle.RightTriangle(112, 11, "Troib");
        System.out.println(rt.toString());

        System.out.println(isRectaangle(rectangle));
        System.out.println(isTriangle(circle));
    }
}
