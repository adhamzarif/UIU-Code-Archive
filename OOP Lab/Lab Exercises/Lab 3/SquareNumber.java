package Lab3;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input number from the user
        double number = scanner.nextDouble();

        // Calculate the square of the number
        double square = number * number;

        // Display the result
        System.out.println("Square of " + number + " is: " + square);

        // Close the scanner to release resources
        scanner.close();
    }
}

