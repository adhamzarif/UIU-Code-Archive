package Lab3.BookStore;4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Scanner scanner = new Scanner(System.in);

        // Adding initial books for demonstration
        bookStore.addBook(new Book("Java Programming", "John Doe", 29.99, 10));
        bookStore.addBook(new Book("Python Programming", "Jane Smith", 24.99, 15));
        bookStore.addBook(new Book("Introduction to Algorithms", "Thomas Cormen", 49.99, 5));

        int choice;
        do {
            System.out.println("\nBook Store Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Sell Books");
            System.out.println("3. Order Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookStore.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to sell: ");
                    String sellTitle = scanner.nextLine();
                    System.out.print("Enter the quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    bookStore.sellBook(sellTitle, sellQuantity);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to order: ");
                    String orderTitle = scanner.nextLine();
                    System.out.print("Enter the quantity to order: ");
                    int orderQuantity = scanner.nextInt();
                    bookStore.orderBook(orderTitle, orderQuantity);
                    break;
                case 4:
                    System.out.println("Exiting Book Store Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

