import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

public class MainController {

    @FXML
    Label priceLabel;

    @FXML
    Button calculateButton;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        // Button was clicked, do something...
        //System.out.println("Hello");
         priceLabel.setText("Tu obliczona cena !!!");

    }


}
