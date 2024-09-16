package Problem2;

public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("John", 201, "Sedan");


        driver1.toggleAvailability();
        System.out.println("Driver availability after toggle: " + driver1.isAvailable());  // Use getter method


        if (driver1.isAvailable()) {
            System.out.println("Driver is available");
        } else {
            System.out.println("Driver is not available");
        }
    }
}


