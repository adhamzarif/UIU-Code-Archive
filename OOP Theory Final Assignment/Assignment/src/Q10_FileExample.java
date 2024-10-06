import java.io.*;

public class Q10_FileExample {
    public static void main(String[] args) {
        try {
            // Take 5 strings as input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = new String[5];
            System.out.println("Enter 5 strings:");
            for (int i = 0; i < 5; i++) {
                strings[i] = reader.readLine();
            }

            // Write the strings to "e.txt" file using BufferedWriter
            FileWriter fileWriter = new FileWriter("e.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

            // Read data from "e.txt" file using BufferedReader and form a sentence
            FileReader fileReader = new FileReader("e.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder sentence = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sentence.append(line).append(" ");
            }
            bufferedReader.close();

            // Write the sentence to "f.txt" file using BufferedWriter
            FileWriter fileWriter2 = new FileWriter("f.txt");
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
            bufferedWriter2.write(sentence.toString());
            bufferedWriter2.close();

            System.out.println("Strings written to e.txt and sentence written to f.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}