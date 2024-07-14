package Lab6.Problem1;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 20);
        triangle.printArea();

        Shape circle = new Circle(10);
        circle.printArea();
    }
}
