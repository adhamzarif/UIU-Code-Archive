import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q9_FileSeparation {
    public static void separateIds(String inputFile, String oddFile, String evenFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter oddWriter = new FileWriter(oddFile);
             FileWriter evenWriter = new FileWriter(evenFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                int id = Integer.parseInt(line);
                if (id % 2 == 0) {
                    evenWriter.write(id + "\n");
                } else {
                    oddWriter.write(id + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "id.txt";
        String oddFile = "odd.txt";
        String evenFile = "even.txt";

        separateIds(inputFile, oddFile, evenFile);
    }
}