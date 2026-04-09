package stringpractise;

import java.util.HashSet;
import java.util.Set;

/*
 * 	Longest Substring Without Repeating Characters
	Function Signature: int lengthOfLongestSubstring(String s)
	Sample Input: "abcabcbb"
	Sample Output: 3 (The longest substring is "abc".)
 * */
public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> charset = new HashSet<>();
		int left = 0, max = 0;
		for(int right=0; right<s.length(); right++) {
			while(charset.contains(s.charAt(right))) {
				charset.remove(s.charAt(left));
				left++;
			}
			charset.add(s.charAt(right));
			max = Math.max(max, right - left + 1);
			
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
