package Problem1;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return super.findArea() * height;
    }
}

