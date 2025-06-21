package data_structure;

public class Main {
	public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Mouse", 50, 299.99);
        Product p2 = new Product(102, "Keyboard", 30, 499.50);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct(101, "Wireless Mouse", 60, 349.99);
        manager.displayInventory();

        manager.deleteProduct(102);
        manager.displayInventory();
    }
}
