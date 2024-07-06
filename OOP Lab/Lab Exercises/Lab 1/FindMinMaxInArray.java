package Lab1;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        // Define the array
        int[] numbers = {2, 3, 9, 8, 13, 1, 5, 19, 15, 0, 4};

        // Initialize variables to store min and max values
        int min = numbers[0]; // Assume the first element is the minimum initially
        int max = numbers[0]; // Assume the first element is the maximum initially

        // Iterate through the array to find min and max values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if current element is smaller
            }
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if current element is larger
            }
        }

        // Print the results
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }
}
