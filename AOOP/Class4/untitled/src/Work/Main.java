package Work;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("AOOP Programming", 101.55));
        books.add(new Book("C Programmming", 5.45));
        System.out.println("Books before sorting:");
        for (Book book : books) {
            System.out.println(book);
        }
        
        Collections.sort(books);
        
        System.out.println("\nBooks sorted by price:");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books, new BookNameComparator());

        System.out.println("\nBooks sorted by name:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
