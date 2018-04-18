public class State {
    private String name;
    private double tax;

    public State(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }

    public double getTax() { return tax; }

    public String getName() {
        return name;
    }

}
