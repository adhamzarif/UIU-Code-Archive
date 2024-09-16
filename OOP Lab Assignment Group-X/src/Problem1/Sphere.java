package Problem1;

public class Sphere extends Circle {

    public Sphere(int radius) {
        super(radius);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(super.findArea() / Math.PI, 1.5);
    }
}

