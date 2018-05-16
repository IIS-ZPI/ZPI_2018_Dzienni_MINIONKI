import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVIO {
    public static List<String> readProductNames(){
        String csvFile = "product_list.csv";
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> productNames = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] productDetails = line.split(cvsSplitBy);


                productNames.add(productDetails[0]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return productNames;

    }

    public static String readProductCategoryForProductName(String productName){
        String csvFile = "product_list.csv";
        String line = "";
        String cvsSplitBy = ",";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] productDetails = line.split(cvsSplitBy);

                if(productName.equals(productDetails[0])){
                    return productDetails[1];
                }




            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    public static Double readPriceForProductName(String productName){
        String csvFile = "product_list.csv";
        String line = "";
        String cvsSplitBy = ",";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] productDetails = line.split(cvsSplitBy);

                if(productName.equals(productDetails[0])){
                    return Double.valueOf(productDetails[2]);
                }




            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }



}
