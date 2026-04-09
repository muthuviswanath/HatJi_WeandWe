package stringpractise;
/*
 * Repeated Substring Pattern

Function Signature: boolean repeatedSubstringPattern(String s)
Sample Input: "abab"
Sample Output: true (The string can be constructed from "ab".)
 */
public class RepeatedSubString {
	public static boolean repeatedSubstringPattern(String s) {
		String tst = s + s;
		String trimmed_str = tst.substring(1, tst.length()-1);
		return trimmed_str.contains(s);
	}
		public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab"));
	}
}
