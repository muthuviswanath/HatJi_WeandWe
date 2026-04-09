/*
 * Longest Palindromic Substring

Function Signature: String longestPalindrome(String s)
Sample Input: "babad"
Sample Output: "babc" (The longest palindromic substring.)
 * */
public class LongestPal {

	public static String check(String s, int left, int right) {//(noon, 0, 1)
		while(left >=0 && right<s.length() 
				&& s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left+1,right);
	}
	public static String longestPalindrome(String s) {
		if(s == null ||s.length()<1) return "";
		String result = "";

		for(int i=0; i<s.length(); i++) {
			String odd = check(s, i, i);
//			String even = check(s,i,i+1);
			if (odd.length() > result.length()) {
				result = odd;
				System.out.println(result);
			}
//			if (even.length() > result.length()) {
//				result = even;
//				System.out.println(result);
//			}
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("noon"));
	}
}
