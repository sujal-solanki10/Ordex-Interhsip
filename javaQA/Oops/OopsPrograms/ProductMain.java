
import java.util.ArrayList;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

}

class Inventory {
    private ArrayList<Product> ProducList;

    public Inventory(){
        ProducList = new ArrayList<>();
    }

    public void addProduct(Product p){
        ProducList.add(p);
    }
    public void removeProduct(Product p){
        ProducList.remove(p);
    }

    public ArrayList<Product> getProductList(){
        return ProducList;
    }

    public void checkLowQulity(){
        for(Product product  : ProducList){
            if(product.getQuantity() <= 100){
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }

    }

}
public class ProductMain {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Mobile", 80);
        Product product3 = new Product("Tablet", 50);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        
        System.out.println();
        System.out.println("Prodect Details");
        inventory.checkLowQulity();

        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product3);
        System.out.println("Prodect Details");
        inventory.checkLowQulity();

    }
    
}
