package Work;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.name.compareTo(book2.name);
    }
}
