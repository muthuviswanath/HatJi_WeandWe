package collectionframework;

public class User {
	private String username, password, email;
	private long contact;
	public User(String username, String password, String email, long contact) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.contact = contact;
	}

	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	//Further getters can be used when we develop the feature called as Profile

}
