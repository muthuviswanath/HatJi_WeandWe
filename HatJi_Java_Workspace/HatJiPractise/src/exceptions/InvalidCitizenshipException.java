package exceptions;

public class InvalidCitizenshipException extends Exception{
	String msg = "Invalid Citizenship. Only Indians are allowed";
	@Override
	public String getMessage() {
		return this.msg;
	}

}
