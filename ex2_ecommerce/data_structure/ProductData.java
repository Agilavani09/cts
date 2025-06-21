package data_structure;

public class ProductData {
	int productId;
    String productName;
    String category;

    public ProductData(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}
