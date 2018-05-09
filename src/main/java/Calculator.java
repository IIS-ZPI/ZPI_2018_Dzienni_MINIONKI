import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

public class Calculator implements ICalculator {
    @Override
    public double calculatePrice(State state, Product product) throws IOException, ParseException {

        double calculatedPrice = 0;
        double price = product.getPrice();
        String category = product.getCategory();
        String stateName = state.getName();
        //json gets a tax for proper state and category
        String jsonFilePath = "jsonFile.json";
        FileReader fileReader = new FileReader(jsonFilePath);
        JSONParser jsonParser = new JSONParser();


        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

        JSONArray states = (JSONArray) jsonObject.get("States");

        for (Object st : states) {
            JSONObject sta = (JSONObject) st;
            String stName = (String) sta.get("Name");
            if (stName.equals(state.getName())) {
                JSONArray categories = (JSONArray) sta.get("Categories");
                for (Object categoryObject : categories
                        ) {
                    JSONObject cat = (JSONObject) categoryObject;
                    if(category.equals(cat.get("Name"))) {
                        long tax = (Long) cat.get("Tax");
                        return price + (tax / 100.0) * price;
                    }
                }
            }
        }

        return -1;
    }
}
