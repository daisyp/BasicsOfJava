package howToJavafx;


public class Product {

    private String name;
    private double price;
    private int amount;

    public Product() {
        this.name = "";
        this.price = 0;
        this.amount = 0;
    }

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // alt + ins ja siis võta getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
