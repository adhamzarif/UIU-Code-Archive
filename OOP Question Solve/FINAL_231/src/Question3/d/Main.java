package Question3.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        double maxScore = 0;
        String topEmployee = "";

        try {

            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));

            String name;
            while ((name = reader.readLine()) != null) {
                reader.readLine(); // Skip ID
                double averageScore = Double.parseDouble(reader.readLine());
                if (averageScore > maxScore) {
                    maxScore = averageScore;
                    topEmployee = name;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Top employee: " + topEmployee + " with score: " + maxScore);
    }
}

