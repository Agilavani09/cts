package data_structure;

public class AppMain {
	public static void main(String[] args) {
        ProductData[] products = {
            new ProductData(101, "Laptop", "Electronics"),
            new ProductData(102, "Mouse", "Electronics"),
            new ProductData(103, "Shirt", "Clothing"),
            new ProductData(104, "Book", "Education")
        };

      
        int index1 = ProductSearchUtil.linearSearch(products, "Shirt");
        if (index1 != -1) {
            System.out.print("Linear Search Found: ");
            products[index1].display();
        } else {
            System.out.println("Linear Search: Product not found.");
        }

       
        ProductSearchUtil.sortProductsByName(products);
        int index2 = ProductSearchUtil.binarySearch(products, "Mouse");
        if (index2 != -1) {
            System.out.print("Binary Search Found: ");
            products[index2].display();
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
