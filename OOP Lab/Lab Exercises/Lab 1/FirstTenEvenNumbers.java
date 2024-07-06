package Lab1;

public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        int count = 0; // Counter to keep track of printed even numbers
        int number = 1; // Start checking numbers from 1

        System.out.println("The first 10 even numbers are:");

        // Loop until we print 10 even numbers
        while (count < 10) {
            // Check if the number is even
            if (number % 2 == 0) {
                System.out.println(number); // Print the even number
                count++; // Increment the count of printed even numbers
            }
            number++; // Move to the next number
        }
    }
}
