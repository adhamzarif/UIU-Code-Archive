package Lab3;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");

        // Read the first number from the user
        double firstNumber = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");

        // Read the second number from the user
        double secondNumber = scanner.nextDouble();

        // Calculate the sum of the two numbers
        double sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        // Close the scanner to release resources
        scanner.close();
    }
}

