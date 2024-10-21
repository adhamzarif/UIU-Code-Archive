package Question5;

class MaxFinder extends Thread {
    private int[] array;
    private int max = Integer.MIN_VALUE;

    public MaxFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
    }

    public int getMax() {
        return max;
    }
}

public class ConcurrentMaxFinder {
    public static void main(String[] args) throws InterruptedException {
        int[][] arrays = {
                {3, 1, -5, 10},
                {-2, 6, 7, 8, 0},
                {12, -6, 4, 2, 1},
                {10, 5, -9, 18, 7}
        };

        MaxFinder[] finders = new MaxFinder[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            finders[i] = new MaxFinder(arrays[i]);
            finders[i].start();
        }

        int overallMax = Integer.MIN_VALUE;
        for (MaxFinder finder : finders) {
            finder.join();  // Wait for the thread to finish
            if (finder.getMax() > overallMax) {
                overallMax = finder.getMax();
            }
        }

        System.out.println("The maximum number is: " + overallMax);
    }
}

