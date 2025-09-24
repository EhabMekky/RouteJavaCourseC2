package dayEight;

public class Book implements Product{

    //default constructor
    public Book() {
    }

    // 2 argument constructor
    public Book(double price, String name) {
        this.price = price;
        this.name = name;
        System.out.println("Book price is: " + price + " and name is: " + name);
    }

    // 4 argument constructor
    public Book(double price, String name, String color, String author) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.author = author;
        System.out.println("Book price is: " + price + ", name is: " + name + ", color is: " + color + " and author is: " + author);
    }

    // 6 argument constructor
    public Book(double price, String name, String color, String author, int pages, int id) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.author = author;
        this.pages = pages;
        this.id = id;
        System.out.println("Book price is: " + price + ", name is: " + name + ", color is: " + color + ", author is: " + author + ", pages is: " + pages + " and id is: " + id);
    }

    // int price; = 0 by default
    // boolean isAvailable; = false by default
    // String name; = null by default

    private double price;
    private String name;
    private String color;
    private String author;
    private int pages;
    private int id;

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public String getColor() {
        return color;
    }
}
