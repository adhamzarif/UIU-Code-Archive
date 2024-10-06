import java.util.ArrayList;

public class Q7_ModifyArrayList {
    public static void main(String[] args) {
        // Given string
        String str = "example";

        // Create an ArrayList of characters from the string
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }

        // Check if the list has at least 3 elements, then modify the third element
        if (charList.size() >= 3) {
            charList.set(2, 'z');  // Replace the third element (index 2) with 'z'
        }

        // Print the contents of the ArrayList
        System.out.println(charList);
    }
}
