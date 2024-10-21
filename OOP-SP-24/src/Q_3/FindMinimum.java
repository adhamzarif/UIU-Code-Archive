package Q_3;

import java.io.*;

public class FindMinimum {
    public static void main(String[] args) {
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            int min = Integer.MAX_VALUE;

            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim()); //white space removed
                    if (number < min) {
                        min = number;
                    }
                } catch (NumberFormatException e) {
                }
            }

            if (min != Integer.MAX_VALUE) {
                writer.write(String.valueOf(min));
            } else {
                writer.write("No numbers found in input.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

