public class Array_2D {
    public static void main(String[] args) {
        //int[][] arr = new int[2][3]; // sub array 2 & each sub arrays elements is 3
        int[][] arr = new int[][]{{5 , 10, 15},{25, 30, 35}};
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
