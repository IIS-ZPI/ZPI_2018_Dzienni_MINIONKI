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
        Scene scene = new Scene(root, 720, 360);
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

       // Main m = new Main();
        //double scorre = m.calculatePrice(new State("Alabama"), socks);
        //System.out.println(scorre);

        JsonIO jsonIO = new JsonIO("jsonFile");

        jsonIO.newStateToJson("Alabama", 10, 20, 13, 15, 16 ,7);
        jsonIO.newStateToJson("Hawaii", 7, 25, 5, 13, 15 ,7);
        jsonIO.newStateToJson("Puerto Rico", 15, 14, 16, 19, 23 ,13);
        jsonIO.newStateToJson("Nevada", 16, 15, 13, 24, 12 ,16);
        jsonIO.newStateToJson("Arizona", 14, 12, 16, 12, 18 ,23);
        

        launch(args);
    }

}
