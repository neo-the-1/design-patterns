package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public Book fetchBook(int idx) {
        return books.get(idx);
    }

    public void addBook(Book book) {
        books.add(book);
    }

}
