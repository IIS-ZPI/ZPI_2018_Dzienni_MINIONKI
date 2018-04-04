public class Product {
    private String name;
    private double tax;

    public Product(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }
}
