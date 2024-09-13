package Problem4;

import java.util.Scanner;
public class Library {

    public boolean startsWithVowel(String bookName) {
        char firstChar = Character.toLowerCase(bookName.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] books = new String[n];

        System.out.println("Enter the names of the books:");
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextLine();
        }

        Library library = new Library();

        int vowelCount = 0;
        for (String book : books) {
            if (library.startsWithVowel(book)) {
                vowelCount++;
            }
        }
        System.out.println("Count: " + vowelCount);
    }
}

