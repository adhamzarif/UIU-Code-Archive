package Lab2;

public class Box {
    // Attributes
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double getVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create Box objects with different dimensions
        Box box1 = new Box(3.5, 4.2, 5.0);
        Box box2 = new Box(2.0, 3.0, 4.0);

        // Calculate and print volumes
        System.out.println("Volume of Box 1: " + box1.getVolume());
        System.out.println("Volume of Box 2: " + box2.getVolume());
    }
}

