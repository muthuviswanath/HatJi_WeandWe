package collectionframework;

import java.util.HashSet;
import java.util.Scanner;

public class EmailManagement {
	public static void main(String[] args) throws DuplicateEmailException{
		HashSet<String> email_list = new HashSet<String>();
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("1. Add Email");
		System.out.println("2. View Email(s)");
		System.out.println("3. Remove Email");
		System.out.println("4. Check Email Exists");
		System.out.println("5. Exit");
		System.out.println("Enter your choice: ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the email to add:");
			String emailid = scan.next();
			if(email_list.contains(emailid)) {
				throw new DuplicateEmailException();
			}
			else {
				email_list.add(emailid);
				System.out.println("Successfully added the email id: " + emailid);
			}
			
			break;
		case 2:
			System.out.println("Email Ids in the system: ");
			for(String emails: email_list) {
				System.out.println(emails);
			}
			break;
		case 3:
			System.out.println("Enter the email id to be removed");
			String remove_email = scan.next();
			if(email_list.contains(remove_email)) {
				email_list.remove(remove_email);
			}
			else {
				System.out.println("Email id not found in the system");
			}
			break;
		case 4:
			System.out.println("Enter the email id to be found");
			String find_email = scan.next();
			if(email_list.contains(find_email)) {
				System.out.println("Email Id Found");
			}
			else {
				System.out.println("Email Id Not Found");
			}
			break;
		case 5:
			System.out.println("Exiting the system...");
			return;
		default:
			System.out.println("Invalid choice");
		}
		}while(true);
	}
}
/*
 * Create an email management system and create it as a menu driven application
 * to have the following menu
 * 
 *  1. Add Email
 *  	If email already exists, throw the exception DuplicateEmailException
 *  2. View Email(s)
 *  3. Remove Email
 *  4. Check Email Exists
 *  5. Exit
 * */


class DuplicateEmailException extends Exception{
	String msg = "Duplicate Email Id. Re-enter a different email id.";
	
	@Override
		public String getMessage() {
			return this.msg;
		}
}

