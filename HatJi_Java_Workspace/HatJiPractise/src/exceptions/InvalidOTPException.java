package exceptions;

public class InvalidOTPException extends Exception{
	String message = "Invalid OTP. Enter a valid OTP";
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
