import java.util.Scanner;

public class CoffeeVendingMachine {
	/*	1. Espresso
	 *	2. Cappuchino
	 * 	3. Tea
	 * 	4. Hot Water
	 * 	5. Latte
	 * 	6. Exit
	 * */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1. Espresso");
			System.out.println("2. Cappuchino");
			System.out.println("3. Tea");
			System.out.println("4. Hot Water");
			System.out.println("5. Latte");
			System.out.println("6. Exit");
			System.out.println("Choose from the menu options: ");
			int choice = s.nextInt();
			if(choice == 1) {
				System.out.println("Your Espresso is ready");
				System.out.println("Thank you! Have a great day!");
			}
			else if(choice == 2) {
				System.out.println("Your Cappuchino is ready");
				System.out.println("Thank you! Have a great day!");
			}
			else if(choice==3) {
				System.out.println("Your Tea is ready");
				System.out.println("Thank you! Have a great day!");
			}
			else if(choice == 4) {
				System.out.println("Your Hot Water is ready");
				System.out.println("Thank you! Have a great day!");
			}
			else if(choice ==5) {
				System.out.println("Your Latte is ready");
				System.out.println("Thank you! Have a great day!");
			}
			else if(choice == 6) {
				return;
			}
			else {
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}
