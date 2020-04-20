package structural.bridge;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookPrinter extends Printer {

    private Book book;

    public BookPrinter(Book book) {
        this.book = book;
    }

    @Override
    protected String header() {
        return book.getTitle();
    }

    @Override
    protected Map<String, Object> details() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("author", book.getAuthor());
        map.put("pages", book.getPages());
        return map;
    }

}
