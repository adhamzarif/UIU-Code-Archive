package Problem1;

public class Circle extends Shape2D {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double findPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

