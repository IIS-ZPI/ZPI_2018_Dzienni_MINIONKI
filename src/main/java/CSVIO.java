import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVIO {
    public static HashMap<String,Product> readProducts(String csvFile){
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String,Product> productsList = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] productDetails = line.split(cvsSplitBy);

                productsList.put(productDetails[0],new Product(productDetails[0], Double.valueOf(productDetails[2]), productDetails[1]));




            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return productsList;


    }


}
