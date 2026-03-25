
public class VariationsSwitch {
	public static void main(String[] args) {
		int day = 1;
		int s = switch(day) {
		case 1 -> {System.out.println("Hello"); yield 1;} 
		case 2-> {System.out.println("Hai"); yield 2;}
		case 3-> {System.out.println("Bye"); 
		int a = 10;
		int b = 30;
		System.out.println(a+b);
		yield 4;}
		default -> 0;
		};
		System.out.println(s);
	}
}
