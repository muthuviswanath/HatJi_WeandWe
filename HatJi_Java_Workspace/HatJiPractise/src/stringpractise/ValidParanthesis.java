package stringpractise;

import java.util.Stack;
public class ValidParanthesis {
	public static boolean isValid(String s) {
		Stack<Character> stck = new Stack<>();
		for(char c: s.toCharArray()) {
			if(c == '(' || c == '{' || c== '[')
				stck.push(c);
			else {
				if (stck.isEmpty()) return false;
				char top = stck.pop();
				if(		(c==')' && top!='(') ||
						(c=='}' && top!= '{') ||
						(c==']' && top!= '[')) 
					return false;
			}
		}
		return stck.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid(")[]{}"));
		System.out.println(isValid("([{}])"));
		System.out.println(isValid("([{]})"));
	}
}
