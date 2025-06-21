package data_structure;

public class OrderSorterBubble {
	 public static void bubbleSort(OrderDetails[] orders) {
	        int n = orders.length;
	        for (int i = 0; i < n - 1; i++) {
	            boolean swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders[j].totalPrice < orders[j + 1].totalPrice) {
	                    OrderDetails temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) break;
	        }
	    }
}
