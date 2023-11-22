package prototype.example2;

public class Movie extends Item {
    private int length;

    public Movie(String title, double price, int length) {
        super(title, price);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
