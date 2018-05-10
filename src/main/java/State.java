import java.util.ArrayList;

public class State {

    private String name;
    private double price;
    private double tax;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




}
