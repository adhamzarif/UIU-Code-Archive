import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q8_MaxAgePersonId {
    public static int findMaxAgePersonId(String filename) {
        int maxAge = 0;
        int maxAgeId = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("/");
                int id = Integer.parseInt(parts[0]);
                int age = Integer.parseInt(parts[1]);

                if (age > maxAge) {
                    maxAge = age;
                    maxAgeId = id;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return maxAgeId;
    }

    public static void main(String[] args) {
        String filename = "person.txt"; // Replace with your actual file name
        int maxAgeId = findMaxAgePersonId(filename);
        System.out.println("ID of the person with maximum age: " + maxAgeId);
    }
}