package data_structure;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    
    public void addProduct(Product product) {
        if (inventory.containsKey(product.productId)) {
            System.out.println("Product ID already exists.");
        } else {
            inventory.put(product.productId, product);
            System.out.println("Product added.");
        }
    }

    
    public void updateProduct(int id, String name, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.productName = name;
            p.quantity = quantity;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

   
    public void deleteProduct(int id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                p.display();
            }
        }
    }
}
