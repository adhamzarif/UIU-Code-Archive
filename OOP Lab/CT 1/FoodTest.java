package Code;

import java.util.Scanner;

public class FoodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a choice:\n1. Price of pizza\n2. Compare areas of pizza.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character left by nextInt()

        if (choice == 1) {
            System.out.println("Enter radius and price per inch of pizza:");
            double radius = scanner.nextDouble();
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character left by nextDouble()

            // Create Pizza object and calculate cost
            Pizza pizza = new Pizza(radius, price);
            pizza.getCost(); // This will calculate and print the cost

        } else if (choice == 2) {
            double[] radiusArr = new double[2];
            int[] unitArr = new int[2];

            for (int i = 0; i < 2; i++) {
                System.out.println("Enter radius of pizza " + (i + 1) + ":");
                radiusArr[i] = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character left by nextDouble()
                System.out.println("Enter number of pizzas of this radius:");
                unitArr[i] = scanner.nextInt();
                scanner.nextLine(); // Consume newline character left by nextInt()
            }

            // Create Pizza object and compare pizzas based on area
            Pizza pizza = new Pizza(0, 0); // Dummy pizza object for calling comparePizza()
            pizza.comparePizza(radiusArr, unitArr);

        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}

