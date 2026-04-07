package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ECommerce {
	static Scanner sc = new Scanner(System.in);	
	static Map<String, User> users = new HashMap<String, User>();
	static List<Product> products = new ArrayList<Product>();
	static Map<String, List<CartItem>> carts = new HashMap();
	static Map<String, List<Product>> wishlist = new HashMap();
	static Map<String, List<Order>> orders = new HashMap();
	public static void main(String[] args) {

		//Pre-seeding the data into the product list

		products.add(new Product(1, "Laptop", 65000.00, 5));
		products.add(new Product(2, "Projector", 85000.00, 3));
		products.add(new Product(3, "Printer", 15000.00, 15));

		int choice = 0;

		do {

			System.out.println("1.Register\n2.Login\n3.Exit");
			try {
				choice = Integer.parseInt(sc.next());
				switch (choice) {
				case 1 -> register();
				case 2 -> login();
				case 3 -> System.out.println("Thank you and visit again");
				default -> System.out.println("Incorrect choice");
				}
			}
			catch (Exception e) {
				System.out.println("Invalid input. Please enter a number");
				choice =0;
			}

		}while(choice !=3);
	}
	// ==============Registration================= 
	public static void register() {
		System.out.println("Enter the user name: ");
		String username = sc.next();

		if(users.containsKey(username)) {
			System.err.println("USer already exists");
			return;
		}

		System.out.println("Enter the password");
		String password = sc.next();

		System.out.println("Enter the email");
		String email = sc.next();

		System.out.println("Enter the phone number");
		long contact = sc.nextLong();

		users.put(username, new User(username, password, email, contact));
		System.out.println("Registration Successful");
	}
	//=================Login===========================
	public static void login() {
		System.out.println("Enter the user name: ");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();

		if(users.containsKey(username) && users.get(username).getPassword().equals(password)) {
			System.out.println("Login Successful");
			userMenu(username);
		}
		else {
			System.err.println("Invalid Credentials");
		}
	}

	//===================UserMenu============================
	public static void userMenu(String username) {
		carts.putIfAbsent(username,new ArrayList<>());
		wishlist.putIfAbsent(username,new ArrayList<>());
		orders.putIfAbsent(username, new ArrayList<>());
		
		int choice = 0;
		do {
			System.out.println("1. View Product");
			System.out.println("2. Add to Cart");
			System.out.println("3. View Cart");
			System.out.println("4. Remove from Cart");
			System.out.println("5. Add to Wishlist");
			System.out.println("6. View Wishlist");
			System.out.println("7. Move Wishlist -> Cart");
			System.out.println("8. checkout");
			System.out.println("9. View Orders");
			System.out.println("10. Logout");
			try {
				choice = Integer.parseInt(sc.next());
				switch(choice) {
				case 1-> viewProducts();
				case 2-> addToCart(username);
				case 3-> viewCart(username);
				case 4-> removeFromCart(username);
				case 5-> addToWishlist(username);
				case 6-> viewWishlist(username);
				case 7-> moveWishlistToCart(username);
				case 8-> checkout(username);
				case 9-> viewOders(username);
				case 10-> System.out.println("Logged out successfully!");
				default -> System.out.println("Invalid choice");
				}
			}
			catch(Exception e) {
				System.out.println("Invalid input. Please enter a number");
				choice =0;
			}

		}while(choice !=10);

	}
	//===============View Products========================
	public static void viewProducts() {
		System.out.println("Available Products");
		for( Product p:products) {
			System.out.println(p.id + ". "+ p.name +" -Rs." + p.price + "(Qty: " + p.qty +" )");
		}
	}

	//===============Add to Cart========================
	public static void addToCart(String username) {
		viewProducts();
		System.out.println("Enter product ID: ");
		int id = sc.nextInt();

		System.out.println("Enter product quantity");
		int qty = sc.nextInt();
		for (Product p: products) {
			if (p.id == id && p.qty >= qty) {
				List<CartItem> cart = carts.get(username);

				for(CartItem c: cart) {
					if(c.product.id == id) {
						c.quantity += qty;
						p.qty -= qty;
						System.out.println("Cart is updated");
						return;
					}
				}

				cart.add(new CartItem(p,qty));
				p.qty -= qty;
				System.out.println("Product added to the cart");
				return;
			}
		}
	}

	//===============viewCart=========================
	public static void viewCart(String username) {
		List<CartItem> cart = carts.get(username);
		if(cart.isEmpty()) {
			System.out.println("The cart is empty");
			return;
		}
		double total = 0;
		System.out.println("\n ==========Your Cart Items============");
		for(CartItem c:cart) {
			double subtotal = c.product.price * c.quantity;
			System.out.println("- " + c.product.name + " x " + c.quantity + " = Rs." + subtotal);
			total += subtotal;
		}
		System.out.println("Total: Rs. " + total);
	}
	//============removeFromCart=========================
	public static void removeFromCart(String username) {
		List<CartItem> cart = carts.get(username);
		if(cart.isEmpty()) {
			System.out.println("Cart is empty");
			return;
		}
		viewCart(username);
		System.out.println("Enter the produvt id to remove");
		int id =sc.nextInt();
		
		Iterator<CartItem> cit = cart.iterator();
		while(cit.hasNext()){
			CartItem c = cit.next();
			if(c.product.id == id) {
				c.product.qty += c.quantity;
				cit.remove();
				System.out.println("Product removed from the cart");
				return;
			}
		}
		System.out.println("Product not found in the cart");
	}
	
	//=====================addToWishlist=======================
	public static void addToWishlist(String username) {
		viewProducts();
		System.out.println("Enter Product Id to add to wishlist: ");
		int id = sc.nextInt();
		
		for (Product p: products) {
			if(p.id == id) {
				for(Product items:wishlist.get(username)) {
					if(items.id == id) {
						System.out.println("You have already wishlisted the product");
						return;
					}
				}
				wishlist.get(username).add(p);
				System.out.println("Product successfully wishlisted");
				return;
			}
		}
		System.out.println("Invalid Product Id: " + id);
	}
	
	//====================viewWishlist=================================
	public static void viewWishlist(String username) {
		List<Product> plist = wishlist.get(username);
		if(plist.isEmpty()) {
			System.out.println("Wishlist is empty");
			return;
		}
		System.out.println("\n============Wishlist Items=================");
		for(Product p:plist) {
			System.out.println("- " + p.id + " " + p.name + " Rs." + p.price);
		}
	}
	
	//====================moveWishlistToCart==============================
	public static void moveWishlistToCart(String username) {
		List<Product> wishlst = wishlist.get(username);
		if(wishlst.isEmpty()) {
			System.out.println("Wishlist is empty");
			return;
		}
		
		viewWishlist(username);
		System.out.println("Enter the product id to move to Cart: ");
		int id = sc.nextInt();
		
		Iterator<Product> itr = wishlst.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			if(p.id == id && p.qty >0) {
				List<CartItem> cart = carts.get(username);
				boolean isFound = false;
				for (CartItem c: cart) {
					if(c.product.id == id) {
						c.quantity += 1;
						p.qty -= 1;
						isFound = true;
						break;
					}
				}
				if(!isFound) {
					carts.get(username).add(new CartItem(p, 1));
					p.qty--;
				}
				itr.remove();
				System.out.println("Item Moved to Cart");
				return;
			}
			else if(p.id==id && p.qty <= 0) {
				System.out.println("Product Out of Stock");
				return;
			}
			
		}
		System.out.println("The product with Product id: " +id + " not available in your wishlist");
	}
	
	//====================checkout=========================
	public static void checkout(String username) {
		List<CartItem> cart = carts.get(username);
		if(cart.isEmpty()) {
			System.out.println("Cart is empty");
			return;
		}
		double total = 0;
		for(CartItem c: cart ) {
			total = c.product.price * c.quantity;
		}
		
		Order order = new Order(cart, total);
		orders.get(username).add(order);
		
		order.printInvoice();
		cart.clear();
		System.out.println("Order Placed Successfully");
		
	}
	
	//===================viewOders==========================
	public static void viewOders(String username) {
		List<Order> userOrders = orders.get(username);
		if(userOrders.isEmpty()) {
			System.out.println("No orders found");
			return;
		}
		
		System.out.println("Your order summary");
		for (Order o : userOrders) {
			o.printInvoice();
		}
	}
}
