/*
 * 1. WAP in java to check for a pattern in a given list of patterns and once verified 
 * return the list of patterns.

The pattern contains:
- The first character should be a lowercase alphabet
- The second character should be a number
- The third character should be a uppercase alphabet
- The fourth character should be a number
- The fifth character should be a lowercase alphabet


Sample Input:
6
a1B2c
d11D3 x
b2R4f
1D2g2x
g2T6h
h7J5i

Sample Output:
a1B2c
b2R4f
g2T6h
h7J5i
 */

import java.util.Scanner;

public class PatternMatcher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[n];
		for (int i=0; i<n; i++) {
			arr[i] = scan.next();
		}

		for(int i=0; i < n; i++) {
			String s = arr[i];
			if(s.length()==5 && Character.isLowerCase(s.charAt(0))
					&&Character.isDigit(s.charAt(1)) && Character.isUpperCase(s.charAt(2))
					&&Character.isDigit(s.charAt(3)) && Character.isLowerCase(s.charAt(4))) {
				System.out.println(s);
			}
		}
	}
}
