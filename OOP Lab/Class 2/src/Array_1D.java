public class Array_1D {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        //also can use int[] arr  = new int[]{1,2,3,4,5}; int[array size] /we can also declare array size too without writing its elements
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
        }
        for(int i: arr)
        {
            System.out.println(i);
        }
    }
}
