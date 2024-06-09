import java.util.Scanner;

public class Array_2D_2 {
    public static void main(String[] args) {
        //int[][] arr = new int[3][];//3 defines how many sub array there will be
        int[][] arr = new int[][]{{2, 3},{4, 5, 6},{7, 8, 9, 10}};
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];
        Scanner sc = new Scanner(System.in);//we create object once but can use it in this function for multiple times

        for(int i = 0; i < 2; i++) {
            int v = sc.nextInt();
            arr2[0][i] = v;
        }

        for(int i = 0; i < 3; i++) { // Changed from 4 to 3 to match the array size
            int v = sc.nextInt();
            arr2[1][i] = v;
        }

        for(int i = 0; i < 4; i++) {
            int v = sc.nextInt();
            arr2[2][i] = v;
        }

        sc.close(); // Close the scanner object

        for(int[] i: arr2) { //int[] because off 2D array
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
