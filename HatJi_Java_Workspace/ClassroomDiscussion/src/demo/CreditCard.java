package demo;

public class CreditCard extends Cards{

	public CreditCard(long cardNumber, int cvv, int exp_month, int exp_year, String cardholder) {
		super(cardNumber, cvv, exp_month, exp_year, cardholder);
	}
	
	@Override
	public void showDetails() {
		System.out.println(this.cardholder + " | " + this.cardNumber);
	}

}
