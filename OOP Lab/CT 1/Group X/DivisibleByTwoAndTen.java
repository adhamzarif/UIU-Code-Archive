package GroupX;

public class DivisibleByTwoAndTen {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {10, 200, 180, 50, 0, 189, 2, 99};

        // Variable to store the sum
        int sum = 0;

        // Iterate through the array and calculate the sum of numbers divisible by 2 and 10
        for (int number : numbers) {
            if (number % 2 == 0 && number % 10 == 0) {
                sum += number;
            }
        }

        // Print the result
        System.out.println("Sum of numbers divisible by 2 and 10: " + sum);
    }
}

