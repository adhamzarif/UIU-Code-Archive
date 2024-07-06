package Lab3.BookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void sellBook(String title, int quantity) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getQuantity() >= quantity) {
                    book.setQuantity(book.getQuantity() - quantity);
                    System.out.println(quantity + " copies of " + title + " sold successfully.");
                    found = true;
                    break;
                } else {
                    System.out.println("Not enough copies of " + title + " available.");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Book with title " + title + " not found.");
        }
    }

    public void orderBook(String title, int quantity) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setQuantity(book.getQuantity() + quantity);
                System.out.println(quantity + " copies of " + title + " ordered successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with title " + title + " not found in the store's catalog.");
        }
    }
}

