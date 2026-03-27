package demo;

public class Cards{
	long cardNumber;
	int cvv;
	int exp_month;
	int exp_year;
	String cardholder;
	public Cards(long cardNumber, int cvv, int exp_month, int exp_year, String cardholder) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.exp_month = exp_month;
		this.exp_year = exp_year;
		this.cardholder = cardholder;
	}
	
	void showDetails() {
		System.out.println("Details of Cards to be displayed here");
	}
	
}
