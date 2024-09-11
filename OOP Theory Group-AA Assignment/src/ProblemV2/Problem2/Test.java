package ProblemV2.Problem2;

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class Test {
    public static void main(String[] args) {
        // heterogeneous array of Shape
        Shape[] s = new Shape[3];

        s[0] = new Rectangle();
        s[1] = new Circle();
        s[2] = new Triangle();

        for (Shape shape : s) {
            shape.draw();
        }
    }
}

