package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.flyweight.Book;
import structural.flyweight.Cart;
import structural.flyweight.Library;

class FlyweightTest {

    @Test
    void testLibrary() {
        Library library = new Library();
        for (int i = 0; i < 10; i++)
            library.addBook(new Book("title" + i, "author" + 1, i * 100, i));

        Cart cart1 = new Cart();
        cart1.addBook(library.fetchBook(2));
        cart1.addBook(library.fetchBook(3));
        cart1.addBook(library.fetchBook(5));
        cart1.addBook(library.fetchBook(7));

        Cart cart2 = new Cart();
        cart2.addBook(library.fetchBook(1));
        cart2.addBook(library.fetchBook(2));
        cart2.addBook(library.fetchBook(3));

        Assertions.assertEquals(2, cart1.fetchCart().get(0).getRevision());
        Assertions.assertEquals(3, cart1.fetchCart().get(1).getRevision());
        Assertions.assertEquals(5, cart1.fetchCart().get(2).getRevision());
        Assertions.assertEquals(7, cart1.fetchCart().get(3).getRevision());

        Assertions.assertEquals(1, cart2.fetchCart().get(0).getRevision());
        Assertions.assertEquals(2, cart2.fetchCart().get(1).getRevision());
        Assertions.assertEquals(3, cart2.fetchCart().get(2).getRevision());

        library.fetchBook(2).setRevision(10);
        Assertions.assertEquals(10, cart1.fetchCart().get(0).getRevision());
        Assertions.assertEquals(10, cart2.fetchCart().get(1).getRevision());

    }

}
