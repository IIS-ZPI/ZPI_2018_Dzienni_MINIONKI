import org.json.simple.parser.ParseException;
import java.io.IOException;

public interface ICalculator {
    double calculatePrice(State state, Product product) throws IOException, ParseException;
}
