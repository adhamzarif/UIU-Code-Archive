package Question3;

import java.io.*;

public class FileProcessing {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("src/input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter writer = new FileWriter("src/output.txt");
            BufferedWriter bw = new BufferedWriter(writer);

            String line;
            int minValue = Integer.MAX_VALUE;

            while (true) {
                try {
                    line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    int value = Integer.parseInt(line);
                    System.out.println(value);
                    if (value < minValue) {
                        minValue = value;
                    }
                } catch (NumberFormatException ignored) {
                    System.out.println("Invalid number format.");
                }
            }
            System.out.println("Minimum value is: " + minValue);
            bw.write(minValue + "");
            bw.close();
            writer.close();
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("File processing completed.");
        }
    }
}

