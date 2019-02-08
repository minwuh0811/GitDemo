package files;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID=8615132221982904115L;
    private String author;
    private String title;
    private int price;
    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{ \t\nAuthor: " + author + "\n\tTitile: " + title+  " \n}" ;
    }
}
