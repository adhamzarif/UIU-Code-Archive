package Problem1;

public class Rectangle extends Shape2D {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double findArea() {
        return length * width;
    }
}
