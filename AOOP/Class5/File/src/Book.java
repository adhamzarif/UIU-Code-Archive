class Book {

    public String name;
    public double price;
    public String genre;
    public String author;

    public Book(String name, double price, String genre, String author) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [Name=" + name + ", Price=" + price + ", Genre=" + genre + ", Author=" + author + "]";
    }
}