
public class SwitchVariations {
	public static void main(String[] args) {
		int day = 1;
		String s = switch(day) {
		case 1 -> "Monday"; 
		case 2-> "Tuesday";
		case 3->  "Wednesday";
		default -> "Invalid";
		};
		System.out.println(s);
	}
}
