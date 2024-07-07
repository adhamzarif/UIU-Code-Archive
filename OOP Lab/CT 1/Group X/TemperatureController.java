package GroupX;

public class TemperatureController {
    private int[] temperatures;

    // Constructor to initialize temperatures attribute
    public TemperatureController(double[] initialTemperatures) {
        this.temperatures = new int[initialTemperatures.length];
        for (int i = 0; i < initialTemperatures.length; i++) {
            // Convert double to int (assuming input temperatures are within valid range)
            this.temperatures[i] = (int) initialTemperatures[i];
        }
    }

    // Getter for temperatures array
    public int[] getTemperatures() {
        return temperatures;
    }

    // Setter for temperatures array
    public void setTemperatures(int[] temperatures) {
        this.temperatures = temperatures;
    }

    // Method to calculate average temperature
    public double averageTemperature() {
        if (temperatures.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        return (double) sum / temperatures.length;
    }

    // Method to find and print index positions where temperature is between 27 and 30
    public void findNormalTempRooms() {
        System.out.print("Rooms with normal temperatures (27-30°C): ");
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] >= 27 && temperatures[i] <= 30) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to find maximum temperature
    public int maxTemperature() {
        if (temperatures.length == 0) {
            throw new IllegalStateException("No temperatures recorded.");
        }

        int max = temperatures[0];
        for (int temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    // Method to find minimum temperature
    public int minTemperature() {
        if (temperatures.length == 0) {
            throw new IllegalStateException("No temperatures recorded.");
        }

        int min = temperatures[0];
        for (int temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    // Method to count temperatures above a given threshold
    public int countAboveThreshold(int threshold) {
        int count = 0;
        for (int temp : temperatures) {
            if (temp > threshold) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        double[] initialTemperatures = {28.5, 29.3, 27.8, 30.2, 26.9};
        TemperatureController controller = new TemperatureController(initialTemperatures);

        // Test each method
        System.out.println("Average temperature: " + controller.averageTemperature());
        controller.findNormalTempRooms();
        System.out.println("Maximum temperature: " + controller.maxTemperature());
        System.out.println("Minimum temperature: " + controller.minTemperature());
        System.out.println("Number of temperatures above 28°C: " + controller.countAboveThreshold(28));
    }
}

