import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVIO {
    public static HashMap<String,Product> readProducts(InputStream csvFile){
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String,Product> productsList = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new InputStreamReader(csvFile))) {

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
