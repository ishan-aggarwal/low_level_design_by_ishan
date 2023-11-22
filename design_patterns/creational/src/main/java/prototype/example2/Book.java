package prototype.example2;

public class Book extends Item {

    private String author;

    public Book(String title, double price, String author) {
        super(title, price);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}
