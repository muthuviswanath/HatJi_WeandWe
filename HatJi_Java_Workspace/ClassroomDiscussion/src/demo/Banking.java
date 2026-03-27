package demo;

public class Banking {
	void login(String username, String password, String captcha) {
		System.out.println("Logging to banking server");
	}
	
	void login(int mpin) {
		System.out.println("Logging to banking server");
	}
	
	void login(Cards c,int pin) {
		System.out.println("Logging to banking server");
	}
	
	public static void main(String[] args) {
		CreditCard cc = new CreditCard(9876543212345323L, 264, 12, 2030, "Pappu");
		DebitCard dc = new DebitCard(6556113375652090L, 350, 11, 2040, "HitlerWoman");
		cc.showDetails();
		dc.showDetails();
				
	}
}

