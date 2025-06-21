package data_structure;

public class OrderDetails {
	int orderId;
    String customerName;
    double totalPrice;

    public OrderDetails(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.println("OrderID: " + orderId + ", Customer: " + customerName + ", Total: ₹" + totalPrice);
    }
}
