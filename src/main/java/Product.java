public class Product {
    private String name;
    private double price; // i changed tax into price
    //added category
    private String category;

    public Product(String name, double price,String category) {
        this.name = name;
        this.price = price;
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {return category;}
}
