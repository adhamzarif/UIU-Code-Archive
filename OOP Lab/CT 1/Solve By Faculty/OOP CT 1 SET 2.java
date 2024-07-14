import java.util.Scanner;

public class Car {
    private double distance;
    private double fuel;

    public Car(double distance, double fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }

    public double getMileage() {
        return distance / fuel;
    }

  
    public double getCost() {
        return fuel * 4; 
    }

    // Method to calculate the maximum cost of fuel over the last 4 weeks
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double[] costs = new double[4];

        System.out.println("Enter the last 4 week's fuel costs:");
        for (int i = 0; i < 4; i++) {
            costs[i] = scanner.nextDouble();
        }

        double maxCost = costs[0];
        for (int i = 1; i < costs.length; i++) {
            if (costs[i] > maxCost) {
                maxCost = costs[i];
            }
        }

        System.out.println("Maximum cost over the last 4 weeks: $" + maxCost);
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance travelled and fuel consumption of car:");
        double distance = scanner.nextDouble();
        double fuel = scanner.nextDouble();

        Car car = new Car(distance, fuel);

        System.out.println("Please enter a choice:");
        System.out.println("1. Mileage of Car.");
        System.out.println("2. Cost of fuel.");
        System.out.println("3. Maximum Cost");

        int choice = scanner.nextInt();

        if (choice == 1) {
            double mileage = car.getMileage();
            System.out.println("Mileage of the car: " + mileage + " miles per unit of fuel");

        } else if (choice == 2) {
            double cost = car.getCost();
            System.out.println("Cost of fuel: $" + cost);

        } else if (choice == 3) {
            car.getAverage();

        } else {
            System.out.println("Invalid choice!");
        }

    }
}
