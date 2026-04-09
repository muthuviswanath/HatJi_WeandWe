package regexpr;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IdentifyPattern {
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".e","Tesla"));//returns false as the second character is not a
		System.out.println(Pattern.matches(".o","To"));//returns true as the second character is o
		
		//Scenario 1: check whether the given string contains alpha numeric character and has 8 characters in total
		//Used to verify the password 
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Pa55w0rd")); // returns true as it matches
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Pa$$w0rd")); // returns false because the pattern $ fails
																	       // for the given regex.
		
		
		//Scenario 2: Verify the mobile number where in it is supposed to be 10 digits and starts with 7 or 8 or 9
		// (Most of the indian numbers starts with these. This may change when the population increases
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7904093412")); // Valid phone number
		// The pattern says that the first digit can be either 7 or 8 or 9 and the remaining 9 digits can be
		// anything from 0 to 9
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6904093412")); // In-Valid phone number
		// LHS = RHS Hence Proved
		
		
		//Scenario 3: Validate the email id (tough and complicated one)
		String email = "muthu@test.in"; // valid but need to verify using regex
		//Note: String has built in method called matches that takes the regexp as the argument
		boolean isValidEmail = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-z]{2,}$");
		

		// The ^ is not present inside the []. This means that the search has to begin from the start
		// [^abc] in this case the ^ is present inside the []. This means negation
		// a-z represents any character from a to z can be present in the email
		// A-Z represents any character from A to Z can be present in the email
		// 0-9 represents that the email id can have numbers from 0 to 9
		// ._%+- represents that there can be special characters.
		// the + followed by @ represents that whatever pattern is present before the @ symbol is applicable
		// only for the email id (the name part)
		// the [a-zA-Z] after the @ symbol is to define the domain names like gmail, outlook, etc...
		// there is a restriction if you see. here , the numbers are not allowed (gmail123) is not a valid domain
		// \\. represents the . after the domain name.
		// [a-zA-Z] represents the sub-domains like .com, .org, .in observe the {2,} this means 
		// a{n,}			a occurs n or more times Ex a{2,}. a occurs 2 times or more than 2 times
		// $ represents the end of string. which means after that not even a single character is allowed.
		
		if(isValidEmail) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("email id invalid");
		}
		
		//Assignment:
		// Write a Java code to get 10 email ids from the user. The sub domain can be gmail.com or gmail.co.in
		// Validate the email address.
		
		
		// You guys after copying this down can leave for the day.
		// The code is uploaded to GitHub. Start as the environment is not safe
		
		String myemail_1 = "muthu@outlook.com";
		String myemail_2 = "muthu@test.gov.in";
		String myemail_3 = "muthu@test.co.in";
		
		System.out.println(myemail_1.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+(\\.[a-zA-Z]{2,})+$"));
		System.out.println(myemail_2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+(\\.[a-zA-Z]{2,})+$"));
		System.out.println(myemail_3.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+(\\.[a-zA-Z]{2,})+$"));
		
		
	}
}
