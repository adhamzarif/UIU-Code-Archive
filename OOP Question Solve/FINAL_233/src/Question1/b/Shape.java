package Question1.b;

public interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class ShapeTest {
    public static void draw(Shape shape) {
        System.out.println("Drawing over " + shape.getArea() + " area.");
    }

    public static void main(String[] args) {
        Shape r = new Rectangle(5, 6);
        Shape s = new Square(3);
        draw(r);
        draw(s);
    }
}
