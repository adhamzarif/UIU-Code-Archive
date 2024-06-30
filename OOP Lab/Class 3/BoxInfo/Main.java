public class Main {
  public static void main(String[] args) {
    // Create two Box objects with different dimensions
    Box box1 = new Box(2.0, 3.0, 4.0);
    Box box2 = new Box(5.0, 6.0, 7.0);

    // Calculate and print the volume of the boxes
    System.out.println("Volume of box1: " + box1.getVolume());
    System.out.println("Volume of box2: " + box2.getVolume());
  }
}
