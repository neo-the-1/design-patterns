package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Book> myBooks = new ArrayList<>();

    public void addBook(Book book) {
        myBooks.add(book);
    }

    public List<Book> fetchCart() {
        return myBooks;
    }

}
