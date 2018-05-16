import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainController {


    @FXML
    Button calculateButton;

    @FXML
    ComboBox<String> productComboBox;


    @FXML
    TableView<State> tableView;

    TableColumn stateNameColumn;
    TableColumn priceColumn;
    TableColumn taxColumn;

    @FXML
    public void initialize(){
        stateNameColumn = new TableColumn("Stan");
        priceColumn = new TableColumn("Cena");
        taxColumn = new TableColumn("VAT");

        stateNameColumn.setPrefWidth(160);
        priceColumn.setPrefWidth(100);
        taxColumn.setPrefWidth(100);

        productComboBox.setItems(FXCollections.observableArrayList(CSVIO.readProductNames()));

        tableView.getColumns().addAll(stateNameColumn, priceColumn, taxColumn);
        stateNameColumn.setCellValueFactory(new PropertyValueFactory<State, String>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<State, Double>("price"));
        taxColumn.setCellValueFactory(new PropertyValueFactory<State, Double>("tax"));
    }

    @FXML
    public void handleButtonAction(ActionEvent event) {
        String productName = productComboBox.getValue();
        //Double price = Double.valueOf(priceField.getText());
        Calculator calculator = new Calculator();

        List<State> states = new ArrayList<>();

        final ObservableList<State> data = FXCollections.observableArrayList();
        tableView.setItems(data);
        try {
            String jsonFilePath = "jsonFile.json";
            FileReader fileReader = new FileReader(jsonFilePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            JSONArray statesJson = (JSONArray) jsonObject.get("States");
            for (Object State : statesJson) {
                JSONObject jsonState = (JSONObject) State;
                State state1 = new State((String) jsonState.get("Name"));
                state1.setTax(calculator.calculateTax(state1, new Product(" ", CSVIO.readPriceForProductName(productName), CSVIO.readProductCategoryForProductName(productName))));
                state1.setPrice(calculator.calculatePrice(state1, new Product(" ", CSVIO.readPriceForProductName(productName), CSVIO.readProductCategoryForProductName(productName))));
                states.add(state1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        data.addAll(states);

        tableView.setItems(data);
    }




}
