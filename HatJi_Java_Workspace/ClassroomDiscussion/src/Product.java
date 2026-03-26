
public class Product {
	int ProductId;
	String ProductName;
	double ProductPrice;

	public Product(int productId, String productName, double productPrice) {
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	
	public void displayProduct() {
		System.out.println(this.ProductId + " | " + this.ProductName + " | " + this.ProductPrice);
	}
}
