import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 2, 4, 6 },
                { 8, 9, 10 },
                { 12, 15, 16 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Sum Calculation
        int sum = 0, m = 3, n = 3;

        // Elements to sum: corners and middle element
        sum += arr[0][0];        // top-left corner
        sum += arr[0][m - 1];    // top-right corner
        sum += arr[1][1];        // middle element
        sum += arr[n - 1][0];    // bottom-left corner
        sum += arr[n - 1][m - 1];// bottom-right corner

        // Print specific elements
        System.out.println("Elements being summed:");
        System.out.println("Top-left: " + arr[0][0]);
        System.out.println("Top-right: " + arr[0][m - 1]);
        System.out.println("Middle: " + arr[1][1]);
        System.out.println("Bottom-left: " + arr[n - 1][0]);
        System.out.println("Bottom-right: " + arr[n - 1][m - 1]);

        // Print the sum of these elements
        System.out.println("Sum = " + sum);
    }
}
