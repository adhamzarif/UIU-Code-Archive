package Question2.b;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            int sum = num1 + num2;

            bw.write(String.valueOf(sum));
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}

