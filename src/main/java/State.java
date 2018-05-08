import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<Product> productList;

    public State(String name) {
        this.name = name;
        //productList = new ArrayList<Product>(); // i ve commented this
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

}
