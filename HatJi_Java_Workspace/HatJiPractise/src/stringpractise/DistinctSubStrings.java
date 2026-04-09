package stringpractise;

import java.util.HashSet;
import java.util.Set;

/*Count Distinct Substrings

Function Signature: int countDistinctSubstrings(String s)
Sample Input: "abc"
Sample Output: 6 (Distinct substrings: "a", "b", "c", "ab", "bc", "abc".)
 * */
public class DistinctSubStrings {
	static int countDistinctSubstrings(String s) {
		Set<String> set = new HashSet<String>(); //set = ['a','ab', 'abc', 'b', 'bc', 'c']
		for(int i=0; i<s.length(); i++) { // i==2
			String sub ="";					//sub = ""
			for(int j=i; j<s.length(); j++) {	//j=2
				sub += s.charAt(j);
				set.add(sub);//i=0, j=0 ['c']
			}
		}
		System.out.println(set);
		return set.size();
	}
	public static void main(String[] args) {
		System.out.println(countDistinctSubstrings("abc"));
	}
}
