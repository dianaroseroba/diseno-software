package bookproject;

public class bookproject {
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    // Constructors
    public bookproject(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public bookproject(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", " + author.toString() + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
