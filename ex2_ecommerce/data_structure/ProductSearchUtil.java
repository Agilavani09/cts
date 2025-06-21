package data_structure;

public class ProductSearchUtil {
	 public static int linearSearch(ProductData[] products, String name) {
	        for (int i = 0; i < products.length; i++) {
	            if (products[i].productName.equalsIgnoreCase(name)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static int binarySearch(ProductData[] products, String name) {
	        int low = 0, high = products.length - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int cmp = name.compareToIgnoreCase(products[mid].productName);
	            if (cmp == 0) return mid;
	            else if (cmp < 0) high = mid - 1;
	            else low = mid + 1;
	        }
	        return -1;
	    }

	    public static void sortProductsByName(ProductData[] products) {
	        for (int i = 0; i < products.length - 1; i++) {
	            for (int j = 0; j < products.length - i - 1; j++) {
	                if (products[j].productName.compareToIgnoreCase(products[j + 1].productName) > 0) {
	                    ProductData temp = products[j];
	                    products[j] = products[j + 1];
	                    products[j + 1] = temp;
	                }
	            }
	        }
	    }
}
