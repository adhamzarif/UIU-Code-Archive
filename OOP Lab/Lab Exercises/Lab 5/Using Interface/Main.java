package Lab6.Problem1;

public class Main {
    public static void main(String[] args) {
        ShapeInterface rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        ShapeInterface triangle = new Triangle(10, 20);
        triangle.printArea();

        ShapeInterface circle = new Circle(10);
        circle.printArea();
    }
}
