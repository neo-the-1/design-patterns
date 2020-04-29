package structural.flyweight;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int revision;

    public Book(String title, String author, int pages, int revision) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.revision = revision;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }
}
