import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));
        Scene scene = new Scene(root, 500, 400);
        scene.getStylesheets().add("style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException, ParseException {


        //fabric of products
        /*
        Product milk = new Product("mleko", 2, "groceries");
        Product water = new Product("woda mineralna", 1.5, "groceries");
        Product cheese = new Product("ser", 4, "groceries");
        Product painPills = new Product("piguly", 5, "prescription drug");
        Product socks = new Product("skarpetki", 30, "Clothing");
        Product tshirt = new Product("t-shirt", 60, "Clothing");
        Product nachos = new Product("nachosy", 6, "prepared food");*/
        //create state
        //  State alabama=new State("alabama");
        //
        JSONObject alabama = new JSONObject();
        alabama.put("Name", "Alabama");

        JSONObject groceries = new JSONObject();
        groceries.put("Name", "Groceries");
        groceries.put("Tax", 15);

        JSONObject prepFood = new JSONObject();
        prepFood.put("Name", "Prepared food");
        prepFood.put("Tax", 10);

        JSONObject clothing = new JSONObject();
        clothing.put("Name", "Clothing");
        clothing.put("Tax", 20);

        JSONArray alabamaCategories = new JSONArray();
        alabamaCategories.add(prepFood);
        alabamaCategories.add(clothing);
        alabamaCategories.add(groceries);

        alabama.put("Categories", alabamaCategories);

        JSONArray states = new JSONArray();
        states.add(alabama);

        JSONObject json = new JSONObject();
        json.put("States", states);

        try {
            FileWriter jsonFileWriter = new FileWriter("jsonFile.json");
            jsonFileWriter.write(json.toJSONString());
            jsonFileWriter.flush();
            jsonFileWriter.close();
            System.out.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }

       // Main m = new Main();
        //double scorre = m.calculatePrice(new State("Alabama"), socks);
        //System.out.println(scorre);
        launch(args);
    }

}
