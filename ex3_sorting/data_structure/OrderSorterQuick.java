package data_structure;

public class OrderSorterQuick {
	 public static void quickSort(OrderDetails[] orders, int low, int high) {
	        if (low < high) {
	            int pi = partition(orders, low, high);
	            quickSort(orders, low, pi - 1);
	            quickSort(orders, pi + 1, high);
	        }
	    }

	    private static int partition(OrderDetails[] orders, int low, int high) {
	        double pivot = orders[high].totalPrice;
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (orders[j].totalPrice >= pivot) {
	                i++;
	                OrderDetails temp = orders[i];
	                orders[i] = orders[j];
	                orders[j] = temp;
	            }
	        }
	        OrderDetails temp = orders[i + 1];
	        orders[i + 1] = orders[high];
	        orders[high] = temp;
	        return i + 1;
	    }  
}
