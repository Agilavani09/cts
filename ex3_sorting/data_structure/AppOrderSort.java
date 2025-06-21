package data_structure;

public class AppOrderSort {
	 public static void main(String[] args) {
	        OrderDetails[] orders = {
	            new OrderDetails(201, "Alice", 4500.50),
	            new OrderDetails(202, "Bob", 999.99),
	            new OrderDetails(203, "Charlie", 7200.00),
	            new OrderDetails(204, "Diana", 3050.75)
	        };

	        System.out.println("Original Orders:");
	        for (OrderDetails o : orders) o.display();

	        System.out.println("\nSorted by Bubble Sort (Descending Total Price):");
	        OrderSorterBubble.bubbleSort(orders);
	        for (OrderDetails o : orders) o.display();

	      
	        orders = new OrderDetails[]{
	            new OrderDetails(201, "Alice", 4500.50),
	            new OrderDetails(202, "Bob", 999.99),
	            new OrderDetails(203, "Charlie", 7200.00),
	            new OrderDetails(204, "Diana", 3050.75)
	        };

	        System.out.println("\nSorted by Quick Sort (Descending Total Price):");
	        OrderSorterQuick.quickSort(orders, 0, orders.length - 1);
	        for (OrderDetails o : orders) o.display();
	    }
}
