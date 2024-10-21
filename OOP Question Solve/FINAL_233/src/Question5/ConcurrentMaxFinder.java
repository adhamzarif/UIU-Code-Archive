package Question5;

class MaxFinder extends Thread {
    private int[] array;
    private int max = Integer.MIN_VALUE;

    public MaxFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}

public class ConcurrentMaxFinder {
    public static void main(String[] args) throws InterruptedException {
        int[] array1 = {3, 1, -5, 10};
        int[] array2 = {-2, 6, 7, 8, 0};
        int[] array3 = {12, -6, 4, 2, 1};
        int[] array4 = {10, 5, -9, 18, 7};

        MaxFinder finder1 = new MaxFinder(array1);
        MaxFinder finder2 = new MaxFinder(array2);
        MaxFinder finder3 = new MaxFinder(array3);
        MaxFinder finder4 = new MaxFinder(array4);

        finder1.start();
        finder2.start();
        finder3.start();
        finder4.start();

        finder1.join();
        finder2.join();
        finder3.join();
        finder4.join();

        int overallMax = Math.max(finder1.getMax(), Math.max(finder2.getMax(), Math.max(finder3.getMax(), finder4.getMax())));

        System.out.println("The maximum number is: " + overallMax);
    }
}

