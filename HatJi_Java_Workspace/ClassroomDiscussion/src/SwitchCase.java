
public class SwitchCase {
	public static void main(String[] args) {		
		enum STATUS {SUCCESS, FAILURE, UNAUTHORIZED, SHIVA}
		STATUS s = STATUS.FAILURE;
		switch(s) {
		case FAILURE:
			System.out.println("API Call failed. Status Code 404");
			break;
		case SUCCESS:
			System.out.println("API Call successful. Status Code 200");
			break;
		case UNAUTHORIZED:
			System.out.println("API Call is not possible due to authorization issue. Status Code 401");
			break;
		case SHIVA:
			System.out.println("GOD CREATED HUMANS");
			break;
		default:
			System.out.println("Unknown Status");
		}
	}
}

//If the weeknumber = 6 or 7 it should print Weekend else
// it should print Weekday
