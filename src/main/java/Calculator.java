public class Calculator implements ICalculator {
    public double calculatePrice(State state, double basePrice) {
        return state.getTax() * basePrice + basePrice;
    }
}
