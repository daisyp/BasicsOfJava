package howToJavafx;


public class Product {

    private String name;
    private double price;
    private int amount;
    private String sool;

    public Product() {
        //default name, nimi mis alguses on
        this.name = "";
        this.price = 0;
        this.amount = 0;
        this.sool = "";
    }

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.sool = sool;
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

    public String getSool() {
        return sool;
    }

    public void setSool(String sool) {
        this.sool = sool;
    }
}
