import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class MainController {

    @FXML
    Label taxLabel;

    @FXML
    Label priceLabel;

    @FXML
    Button calculateButton;

    @FXML
    TextField stateField;

    @FXML
    TextField categoryField;

    @FXML
    TextField productField;

    @FXML
    TextField priceField;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        String cat=categoryField.getText();
        String st=stateField.getText();
        String prod=productField.getText();
        Double pri=Double.valueOf(priceField.getText());
        Main m=new Main();
        double score=0;
        try {
             score=m.calculatePrice(new State(st),new Product(prod,pri,cat));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

         taxLabel.setText("Tu obliczony podatek !!!");
         priceLabel.setText(String.valueOf(score));
    }


}
