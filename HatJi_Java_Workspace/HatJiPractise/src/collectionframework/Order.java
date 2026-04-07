package collectionframework;

import java.util.Date;
import java.util.List;

public class Order {
	List<CartItem> items;
	double totalamount;
	Date orderDate;
	public Order(List<CartItem> items, double totalamount) {
		this.items = items;
		this.totalamount = totalamount;
		this.orderDate = new Date();
	}

	public void printInvoice() {
		System.out.println("=================================");
		for(CartItem item: items ) {
			System.out.println(item.product.name + " x " + item.quantity  +
					" = Rs. " + (item.product.price * item.quantity));
		}
		System.out.println("Total: Rs. " + totalamount);
		System.out.println("Order Date: " + orderDate);
	}
}
