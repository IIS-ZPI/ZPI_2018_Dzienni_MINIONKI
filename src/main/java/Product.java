public class Product {
    private String name;
    private double basePrice;
    private double price;
    private ProductType type;

    public Product(String name, double basePrice, ProductType type) {
        this.name = name;
        this.basePrice = basePrice;
        this.type = type;
    }

    public String getName() {
        return name;
    }//

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
