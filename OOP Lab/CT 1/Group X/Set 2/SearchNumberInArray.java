package GroupX.Set2;

public class SearchNumberInArray {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = {10, 200, 180, 50, 0, 189, 2, 99};

        // Number to search
        int target = 180;

        // Call the method to find the index of the target number
        int index = findIndex(numbers, target);

        // Print the index
        System.out.println("Index of " + target + " is: " + index);
    }

    // Method to find the index of a number in an array
    public static int findIndex(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if current element equals the target
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        // If target is always assumed to be in the array, we won't reach here
        return -1; // Handle "Not Found" case (though not needed as per assumption)
    }
}

