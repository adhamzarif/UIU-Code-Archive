//Create a class named “Box” which has 3 attribute: length, width, height and a method named
//getVolume(). getVolume() method will calculate the volume of the Box and return the value.
//From “main” method create 2 Box objects with different length, width, height, then call the
//getVolume() method and print the volumes.
public class Box {
  double length;
  double width;
  double height;

  // Constructor to initialize the dimensions of the box
  Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  // Method to calculate the volume of the box
  double getVolume() {
    return length * width * height;
  }
}
