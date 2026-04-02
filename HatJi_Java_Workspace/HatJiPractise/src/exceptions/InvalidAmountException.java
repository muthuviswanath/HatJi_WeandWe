package exceptions;

public class InvalidAmountException extends Exception{
	String message = "Invalid Amount. Verify the amount entered.";
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
