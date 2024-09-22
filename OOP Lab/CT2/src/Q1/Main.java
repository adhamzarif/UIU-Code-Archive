package Q1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create the book objects
        Book obj1 = new Book(100, "aa", "XYZ1");
        Book obj2 = new Book(200, "bb", "XYZ2");
        Book obj3 = new Book(300, "cc", "XYZ3");
        Book obj4 = new Book(400, "aa", "XYZ4");
        Book obj5 = new Book(500, "cc", "XYZ5");

        // Add them to a list
        ArrayList<Book> books = new ArrayList<>();
        books.add(obj1);
        books.add(obj2);
        books.add(obj3);
        books.add(obj4);
        books.add(obj5);

        // Sort the books
        Collections.sort(books);

        // Print the sorted books
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

