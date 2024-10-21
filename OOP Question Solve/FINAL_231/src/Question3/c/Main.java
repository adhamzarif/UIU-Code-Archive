package Question3.c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("increment.txt"));

            String name;
            while ((name = reader.readLine()) != null) {
                String id = reader.readLine();
                double averageScore = Double.parseDouble(reader.readLine());
                if (averageScore > 75) {
                    writer.write(name + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

