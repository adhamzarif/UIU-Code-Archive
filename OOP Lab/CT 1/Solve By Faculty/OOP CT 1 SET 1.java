import java.util.Scanner;

public class Pizza {

    private double radius;
    private double price;

    public Pizza(double radius, double price) {
        this.radius = radius;
        this.price = price;
    }

    // Method to calculate the cost of the pizza
    public double getCost() {
        return price * radius;
    }

    // Method to compare two pizzas
    public static void comparePizza(double[] radii, int[] units) {
        // Calculate total areas
        double area1 = 3.14 * radii[0] * radii[0] * units[0];
        double area2 = 3.14 * radii[1] * radii[1] * units[1];

        // Compare areas
        if (area1 > area2) {
            System.out.println("Take pizza 1");
        } else {
            System.out.println("Take pizza 2");
        }
    }
}


public class FoodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a choice:");
        System.out.println("1. Price of pizza.");
        System.out.println("2. Compare areas of pizza.");

        int choice = scanner.nextInt();

        if (choice == 1) {
     
            System.out.println("Enter radius and price per inch of pizza:");
            double radius = scanner.nextDouble();
            double price = scanner.nextDouble();

            Pizza pizza = new Pizza(radius, price);
            double cost = pizza.getCost();
            System.out.println("Cost of pizza: " + cost);

        } else if (choice == 2) {
 
            double[] radii = new double[2];
            int[] units = new int[2];

            System.out.println("Enter radius and units of pizza 1:");
            radii[0] = scanner.nextDouble();
            units[0] = scanner.nextInt();

            System.out.println("Enter radius and units of pizza 2:");
            radii[1] = scanner.nextDouble();
            units[1] = scanner.nextInt();

            Pizza.comparePizza(radii, units);
        } else {
            System.out.println("Invalid choice!");
        }

    }
}
