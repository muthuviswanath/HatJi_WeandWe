package stringpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Word Break Problem

Function Signature: boolean wordBreak(String s, List<String> wordDict)
Sample Input: ("leetcode", ["lee", "code"])
Sample Output: true (The string can be segmented.)
 */
public class WordBreakProblem {

	public static boolean wordBreak(String s, List<String> wordDict) {
		if(s.length() == 0) return true;

		for(String word: wordDict) {
			if(s.startsWith(word)) {
				if(wordBreak(s.substring(word.length()), wordDict)) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList<String> wlist = new ArrayList<String>();
		wlist.add("leet");wlist.add("code");
		System.out.println(wordBreak("leetcode", wlist));
	}
}
