package exceptions;

import java.util.Scanner;

public class ProvideAadharCard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("Enter your Citizenship");
		String citizen = scan.next();
		System.out.println("Enter your Gender");
		String gender = scan.next();
		AadharApp.verifyCitizenship(citizen);
		}
		catch(InvalidCitizenshipException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
