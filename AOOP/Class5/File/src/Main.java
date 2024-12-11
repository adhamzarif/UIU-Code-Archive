import java.io.*;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        books[0] = new Book("The Great Science", 10.99, "Fiction", "F. Scott Fitzgerald");
        books[1] = new Book("1984", 8.99, "Dystopian", "George Orwell");
        books[2] = new Book("John Wick", 12.50, "Adventure", "Herman Melville");
        books[3] = new Book("The Catcher in the Rye", 9.99, "Fiction", "J.D. Salinger");
        books[4] = new Book("To a Mockingbird", 11.99, "Fiction", "Harper Lee");

        try (FileOutputStream fos = new FileOutputStream("Book.txt")) {
            for (Book book : books) {

                fos.write(book.name.getBytes());
                fos.write("\n".getBytes());
                fos.write(Double.toString(book.price).getBytes());
                fos.write("\n".getBytes());
                fos.write(book.genre.getBytes());
                fos.write("\n".getBytes());
                fos.write(book.author.getBytes());
                fos.write("\n".getBytes());
            }
            System.out.println("Books have been written to Book.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("Book.txt")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line;
            int index = 0;
            Book[] newBooks = new Book[5];

            while ((line = reader.readLine()) != null && index < 5) {
                String name = line;
                String priceLine = reader.readLine();
                String genre = reader.readLine();
                String author = reader.readLine();

                double price = Double.parseDouble(priceLine);
                newBooks[index++] = new Book(name, price, genre, author);
            }

            System.out.println("\nBooks have been read from Book.txt:");
            for (Book book : newBooks) {
                System.out.println(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}