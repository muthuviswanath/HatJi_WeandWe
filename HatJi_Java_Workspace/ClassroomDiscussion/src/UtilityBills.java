import java.util.Scanner;

public class UtilityBills {

	static void electricitybill(char usertype, float units) {
		float total_bill = 0;
		if(units <=0) {
			System.out.println("Invalid units. Units cannot be negative");
			return;
		}
		if(usertype == 'r' || usertype == 'R') {
			if (units <= 100) {
				System.out.println("Your Bill Amount: 0.0. No need to pay to BESCOM");
			}
			else if(units >100) {
				total_bill = units * 2.45f;
				System.out.println("Your Bill Amount: " + total_bill);
			}
		}
		else if (usertype == 'c' || usertype == 'C') {
			total_bill = units * 5.65f;
			System.out.println("Your Bill Amount: " + total_bill);
		}
	}
	static void waterbill(char usertype, float litres) {
		if (litres <=0) {
			System.out.println("Invalid litres");
			return;
		}
		float total = 3.5f * litres;
		System.out.println("Water Bill: " + total);
	}
	static void waterbill(float gallons, char usertype) {
		if (gallons <=0) {
			System.out.println("Invalid gallons");
			return;
		}
		float total = 0;
		float ltrs = 1000f;
		if(gallons > 5) {
			total = (gallons * ltrs) * 0.98f * 5.65f;
			System.out.println("Your water bill: " + total);
		}
		else {
			total = (gallons * ltrs) * 5.65f;
			System.out.println("Your water bill: " + total);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("1. Electricity Bill");
			System.out.println("2. Water Bill");
			System.out.println("3. Exit");
			System.out.println("Enter your choice [1-3]: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Residential User / Commercial User [R/C]: ");
				char usertype = scan.next().charAt(0);
				System.out.println("Units Consumed: ");
				float units = scan.nextFloat();
				electricitybill(usertype, units);
				break;
			case 2:
				System.out.println("Residential User / Commercial User [R/C]: ");
				char usrtype = scan.next().charAt(0);
				if(usrtype == 'r' || usrtype == 'R') {
					System.out.println("Litres Consumed: ");
					float ltrs = scan.nextFloat();
					waterbill(usrtype, ltrs);
				}
				else if(usrtype == 'c' || usrtype == 'C') {
					System.out.println("Gallons Consumed: ");
					float gallons = scan.nextFloat();
					waterbill(gallons,usrtype);
				}
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}
