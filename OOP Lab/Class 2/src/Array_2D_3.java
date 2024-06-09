import java.util.Scanner;

public class Array_2D_3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5, 10, 15},{25, 30, 35}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            int v = sc.nextInt();
            arr2[0][i] = v;
        }
        for(int i = 0; i < 3; i++) {
            int v = sc.nextInt();
            arr2[1][i] = v;
        }
        for(int i = 0; i < 4; i++) {
            int v = sc.nextInt();
            arr2[2][i] = v;
        }
        sc.close();

        for(int[] row : arr2) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
