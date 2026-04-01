package JavaStrings;

public class StringFormatting {
	public static void main(String[] args) {
		String pm = "Rahul Gandhi";
		System.out.println(String.format("My Country's PM Name is: %s", pm));
		System.out.println(String.format("Value of PIE: %f", 3.1415921325));
		System.out.println(String.format("Value of PIE: %.2f", 3.1415921325));
		//Value of PIE is:          3.14
		System.out.println(String.format("Value of PIE: %s","uuuuuuuuuu"));
		System.out.println(String.format("Value of PIE: %10.2f", 3.1415921325));
		
		System.out.println(String.format("%d", 123));
		System.out.println(String.format("%10d", 123));
		System.out.println(String.format("%-10d", 123));
		System.out.println(String.format("%2d", 23));
		//a prevailing 0 works only with an integer value
		//When a string is involved, if the format of floating point is used, 
		//the integer part is used to fill the unavailable characters with spaces
		//the decimal part is used to extract the number of characters
		System.out.println(String.format("%7-.5s", "Selenium Automation"));
		
	}
}
