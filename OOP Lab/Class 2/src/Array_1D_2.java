public class Array_1D_2 {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = i + 1;
        }
        for(int i: arr2)
        {
            System.out.println(i);
        }
    }
}
