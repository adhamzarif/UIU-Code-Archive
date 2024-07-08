package Code;

import java.util.Scanner;

public class Pizza {
    private double radius;
    private double pricePerInch;

    // Constructor
    public Pizza(double radius, double pricePerInch) {
        this.radius = radius;
        this.pricePerInch = pricePerInch;
    }

    // Method to calculate cost and print it directly
    public void getCost() {
        double cost = pricePerInch * radius;
        System.out.println("Cost of the pizza: $" + cost);
    }

    // Method to compare pizzas based on area
    public void comparePizza(double[] radiusArr, int[] unitArr) {
        double area1 = calculateArea(radiusArr[0]);
        double area2 = calculateArea(radiusArr[1]);

        double totalArea1 = area1 * unitArr[0];
        double totalArea2 = area2 * unitArr[1];

        if (totalArea1 > totalArea2) {
            System.out.println("Take pizza 1");
        } else {
            System.out.println("Take pizza 2");
        }
    }

    // Helper method to calculate area of a pizza
    private double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}


