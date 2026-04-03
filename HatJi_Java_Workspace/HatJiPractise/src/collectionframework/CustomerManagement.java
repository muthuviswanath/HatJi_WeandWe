package collectionframework;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {
	static int getCapacity(ArrayList<?> list) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] data = (Object[])field.get(list);
		return data.length;
	}
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		ArrayList<String> customers = new ArrayList<String>();
		int choice;
		do {
			System.out.println("--Customer Management--");
			System.out.println("1. Add Customer");
			System.out.println("2. Remove Customer");
			System.out.println("3. View Customer");
			System.out.println("4. Ensure Capacity");
			System.out.println("5. Trim Cpacity to Size");
			System.out.println("6. Display the size and Capacity");
			System.out.println("7. Exit");
			System.out.println("Enter your choice: ");
			choice = scan.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.println("Enter the customer name: ");
				String name = scan.next();
				customers.add(name);
				System.out.println("\nCustomer added successfully...\n");
				break;
			case 2:
				System.out.println("Enter the customer name to be removed: ");
				String cust_name = scan.nextLine();
				customers.remove(cust_name);
				System.out.println("\nCustomer removed successfully...\n");
				break;
			case 3:
				System.out.println("Customer List:");
				for(String s: customers) {
					System.out.println(s);
				}
				break;
			case 4:
				System.out.println("Expected number of customers: ");
				int capacity = scan.nextInt();
				customers.ensureCapacity(capacity);
				System.out.println("The capacity is now set to " + capacity + " customers");
				break;
			case 5:
				customers.trimToSize();
				System.out.println("The capacity is trimmed to match the size of the list: " + customers.size());
				break;
			case 6:
				System.out.println("Size of the Customer List: " + customers.size());
				System.out.println("Capacity of the Customer List: " + getCapacity(customers));
				break;
			case 7:
				System.out.println("Exiting the application...");
				break;
			default:
				break;
			}
		}while(choice != 7);
	}
}
