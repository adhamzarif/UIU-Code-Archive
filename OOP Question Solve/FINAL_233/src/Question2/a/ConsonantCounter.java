package Question2.a;

import java.io.*;

public class ConsonantCounter {
    public static void main(String[] args) {
        int consonantCount = 0;
        try {

            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

            String line;
            while (true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                for (int i = 0; i < line.length(); i++) {
                    if (isConsonant(line.charAt(i))) {
                        consonantCount++;
                    }
                }
            }

            writer.write(String.valueOf(consonantCount));
            System.out.println("Consonant count: " + consonantCount);
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return false;
            }
            else return true;
        }
        else return false;
    }
}

