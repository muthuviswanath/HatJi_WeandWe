import java.util.Scanner;

public class StringPractise1 {
	public static void main(String[] args) {
		String input = "hello world";
		char remove = 'o';
		String result = "";
		for (int i=0; i<input.length(); i++) {
			if(input.charAt(i) != remove) {
				result += input.charAt(i);
			}
		}
		System.out.println(result);
		
		String inp = "hello world from java";
		char[] ch = inp.toCharArray();
		if(ch[0] >='a' && ch[0] <='z') {
			ch[0] = (char)(ch[0]-32);
		}
		for(int i=1; i<ch.length; i++) {
			if(ch[i-1] == ' '&& ch[i] >='a' && ch[i] <= 'z') {
				ch[i] = (char)(ch[i]-32);
			}
		}
		System.out.println(inp);
		System.out.println();
		System.out.println(new String(ch));
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		if(s1.length() == s2.length() && (s1+s1).contains(s2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		String msg[] = "This quick brown foxes jumps".split(" ");
		Scanner scan = new Scanner(System.in);
		char targ = scan.next().charAt(0);
		int count = 0;
		for(int i=0; i<msg.length; i++) {
			if(msg[i].length() > 0 && msg[i].charAt(msg[i].length()-1) == targ) {
				count++;
			}
		}
		System.out.println("No.of Words that ends with s are: " + count);
		
		
		String mymsg = "This quick brown foxes jumps";
		int counter = 0;
		for(int i =0 ; i<mymsg.length()-1; i++) {
			if(mymsg.charAt(i) == 's' && mymsg.charAt(i+1) == ' ') {
				counter++;
			}
		}
		if(mymsg.charAt(mymsg.length()-1 )== 's') {
			counter++;
		}
		System.out.println(counter);
		
		
		int cntr = 0;
		for(int i=0; i<mymsg.length(); i++) {
			if(mymsg.charAt(i) == 's') {
				if(i==mymsg.length()-1 || mymsg.charAt(i+1)==' ') {
					cntr++;
				}
			}
		}
		
		System.out.println("Count:" + cntr);
		
		
		String st = "banana";
		String repl = st.replace("na", "xy");
		System.out.println(repl);
	}
}
