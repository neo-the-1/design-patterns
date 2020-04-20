package structural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.bridge.*;

class BridgeTest {

    @Test
    void testMoviePrinterWithConsoleFormatter() {
        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setYear(1999);
        movie.setRuntimeInMinutes(150);
        Printer printer = new MoviePrinter(movie);
        String output = printer.print(new ConsoleFormatter());
        System.out.println(output);
        Assertions.assertEquals("The Matrix" + System.lineSeparator() +
                "----------" + System.lineSeparator() +
                "runtime(min)=150" + System.lineSeparator() +
                "year=1999" + System.lineSeparator(), output);
    }

    @Test
    void testMoviePrinterWithMarkdownFormatter() {
        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setYear(1999);
        movie.setRuntimeInMinutes(150);
        Printer printer = new MoviePrinter(movie);
        String output = printer.print(new MarkdownFormatter());
        System.out.println(output);
        Assertions.assertEquals("# The Matrix" + System.lineSeparator() +
                "- runtime(min): 150" + System.lineSeparator() +
                "- year: 1999" + System.lineSeparator(), output);
    }

    @Test
    void testBookPrinterWithConsoleFormatter() {
        Book book = new Book();
        book.setTitle("A BRIEF HISTORY OF TIME");
        book.setAuthor("Stephen Hawking");
        book.setPages(256);
        Printer printer = new BookPrinter(book);
        String output = printer.print(new ConsoleFormatter());
        System.out.println(output);
        Assertions.assertEquals("A BRIEF HISTORY OF TIME" + System.lineSeparator() +
                "-----------------------" + System.lineSeparator() +
                "author=Stephen Hawking" + System.lineSeparator() +
                "pages=256" + System.lineSeparator(), output);
    }

    @Test
    void testBookPrinterWithMarkdownFormatter() {
        Book book = new Book();
        book.setTitle("A BRIEF HISTORY OF TIME");
        book.setAuthor("Stephen Hawking");
        book.setPages(256);
        Printer printer = new BookPrinter(book);
        String output = printer.print(new MarkdownFormatter());
        System.out.println(output);
        Assertions.assertEquals("# A BRIEF HISTORY OF TIME" + System.lineSeparator() +
                "- author: Stephen Hawking" + System.lineSeparator() +
                "- pages: 256" + System.lineSeparator(), output);
    }

}
