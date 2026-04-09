package regexpr;

public class Reg {
	public static void main(String[] args) {
		String s = "#$%_A56";
		System.out.println(s.matches("^[a-zA-Z0-9]"));
		
	}
}
