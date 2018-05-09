import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonIO {
    JSONArray states;
    String name;

    JsonIO(String name){
        this.name = name;
        this.states = new JSONArray();
    }

    public void newStateToJson(String stateName, double GroceriesTax, double PreparedFoodTax, double PrescriptionDrugTax, double NonPrescriptionDrugTax, double ClothingTax, double IntangiblesTax){
        JSONObject state = new JSONObject();
        state.put("Name", stateName);

        JSONObject groceries = new JSONObject();
        groceries.put("Name", "Groceries");
        groceries.put("Tax", GroceriesTax);

        JSONObject preparedFood = new JSONObject();
        preparedFood.put("Name", "Prepared food");
        preparedFood.put("Tax", PreparedFoodTax);

        JSONObject prescriptionDrug = new JSONObject();
        prescriptionDrug.put("Name", "Prescription Drug");
        prescriptionDrug.put("Tax", PrescriptionDrugTax);

        JSONObject nonPrescriptionDrug = new JSONObject();
        nonPrescriptionDrug.put("Name", "Non-Presription Drug");
        nonPrescriptionDrug.put("Tax", NonPrescriptionDrugTax);

        JSONObject clothing = new JSONObject();
        clothing.put("Name", "Clothing");
        clothing.put("Tax", ClothingTax);

        JSONObject intangibles = new JSONObject();
        intangibles.put("Name", "Intangibles");
        intangibles.put("Tax", IntangiblesTax);

        JSONArray stateCategories = new JSONArray();
        stateCategories.add(groceries);
        stateCategories.add(preparedFood);
        stateCategories.add(prescriptionDrug);
        stateCategories.add(nonPrescriptionDrug);
        stateCategories.add(clothing);
        stateCategories.add(intangibles);

        state.put("Categories", stateCategories);

        states.add(state);
        saveToJson();
    }

    public double getTaxFronJson(String stateName){
        return 0;
    }

    private void saveToJson(){
        JSONObject json = new JSONObject();
        json.put("States", states);
        try {
            FileWriter jsonFileWriter = new FileWriter(name + ".json");
            jsonFileWriter.write(json.toJSONString());
            jsonFileWriter.flush();
            jsonFileWriter.close();
            System.out.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
