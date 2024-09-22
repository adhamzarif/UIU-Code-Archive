package Q1;

public class Book implements Comparable<Book> {
    String title;
    String author_name;
    int price;

    public Book(int price, String author_name, String title) {
        this.price = price;
        this.author_name = author_name;
        this.title = title;
    }

    @Override
    public int compareTo(Book other) {
        // Compare by author name first
        int comparison = this.author_name.compareTo(other.author_name);
        // If author names are the same, compare by price in descending order
        if (comparison == 0) {
            return Integer.compare(other.price, this.price);  // Descending price
        }
        return comparison;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author_name + ", Price: " + price + "]";
    }
}

