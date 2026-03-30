package demo;

public class User {
	private int userId;
	private String name;
	private final String username = "admin";
	private final String password = "admin123";

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setName(String username, String password, String name) {
		if(username.equals(this.username) && password.equals(this.password)
				&& name != null && name !="" && name != " ")
		this.name = name;
	}

	public String getName() {
		return this.name;
	}


}
