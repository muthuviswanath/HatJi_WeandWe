import java.util.Scanner;

public class CapKart {
	public static void main(String[] args) {
		enum STATUS {Shipped,OutForDelivery,Delivered}
		Scanner scan = new Scanner(System.in);
		Product pr = null;
		Cart car = null;
		STATUS setStatus  = null;
		do {
			System.out.println("1. Create Product\n"
					+ "2. Add Product to Cart\n"
					+ "3. View Cart\n"
					+ "4. Track Shipping\n"
					+ "5. Exit");
		System.out.println("Enter your choice: [1-5]: ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the product Id: ");
			int pid = scan.nextInt();
			System.out.println("Enter the product Name: ");
			String pname = scan.next();
			System.out.println("Enter the product Price: ");
			double pprice = scan.nextDouble();
			pr = new Product(pid, pname, pprice);
			break;
		case 2:
			System.out.println("List of available product(s): ");
			pr.displayProduct();
			System.out.println();
			System.out.println("Enter the required quantity: ");
			int quant = scan.nextInt();
			car = new Cart(pr, quant);
			System.out.println("Products added successfully to the cart");
			break;
		case 3:
			System.out.println("Your Cart Items:\n");
			car.displayCartItems();
			System.out.println("Enter the status of the Order: ");
			String orderstatus = scan.next();
			if(orderstatus.equals("Shipped")) {
				setStatus  = STATUS.Shipped;
			}
			else if(orderstatus.equals("OutforDelivery")) {
				setStatus  = STATUS.OutForDelivery;
			}
			else if(orderstatus.equals("Delivered")) {
				setStatus  = STATUS.Delivered;
			}
			else {
				System.out.println("Invalid Status");
			}
			break;
		case 4:
			System.out.println("Current Status of your Order: " + setStatus);
			break;
		case 5:
			return;
		default:
			System.out.println("Invalid choice");
		}
		}while(true);
	}
}

class Cart{
	static int OrderId = 12354;
	Product p;
	int qty;
	double total;
	public Cart(Product p, int qty) {
		this.p = p;
		this.qty = qty;
	}

	void calculateTotal() {
		this.total = this.p.ProductPrice * this.qty; 
	}

	void displayCartItems() {
		calculateTotal();
		System.out.println("------------------------------------------------------");
		System.out.println("OrderId\tProductName\tQuantity\tPrice\tAmount");
		System.out.println(OrderId+"\t"+this.p.ProductName+"\t"+qty+"\t"+this.p.ProductPrice+"\t"+this.total);
		System.out.println("------------------------------------------------------");
		System.out.println("Total: " + this.total);
		System.out.println("------------------------------------------------------");
	}

}
