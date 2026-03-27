package demo;

public class DebitCard extends Cards {
	public DebitCard(long cardNumber, int cvv, int exp_month, int exp_year, String cardholder) {
		super(cardNumber, cvv, exp_month, exp_year, cardholder);
	}
	@Override
	public void showDetails() {
		System.out.println(this.cardholder + " | " + this.cardNumber + " | " + this.exp_year);
	}
}
