import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Product {
    private String name;
    private double price; // i changed tax into price
    //added category
    private String category;

    public Product(String name, double price,String category) throws IOException, ParseException, CategoryDoesNotExistException {
        this.name = name;
        this.price = price;
        if(!JsonIO.getCategoryListFromJson("jsonFile").contains(category))
            throw new CategoryDoesNotExistException();
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {return category;}
}
