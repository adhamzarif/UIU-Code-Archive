package Work;

public class Book implements Comparable<Book> {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', price=" + price + "}";
    }
}

