package exceptions;

public class InvalidAccountNumberException extends Exception{
	String message = "Invalid Account Number. Enter a valid Account Number";
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
