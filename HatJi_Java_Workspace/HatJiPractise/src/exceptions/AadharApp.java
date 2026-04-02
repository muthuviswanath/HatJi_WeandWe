package exceptions;

public class AadharApp {
	
	static void verifyCitizenship(String citizenship) throws InvalidCitizenshipException {
		if(!citizenship.equalsIgnoreCase("Indian")) {
			throw new InvalidCitizenshipException();
		}
		else {
			System.out.println("Valid Cititizenship");
		}
	}
	
}
