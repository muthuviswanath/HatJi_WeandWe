package stringpractise;

import java.util.ArrayList;
import java.util.List;

/*
 * Finding All Permutations

Function Signature: List<String> permute(String s)
Sample Input: "abc"
Sample Output: ["abc", "acb", "bac", "bca", "cab", "cba"] (All unique permutations.)
 */
public class AllPermutations {
	static List<String> permute(String s){
		List<String> result = new ArrayList<String>();
		for(int i=0; i<s.length();i++) {
			for(int j=0; j<s.length();j++) {
				for(int k=0; k<s.length();k++) {
					if( i!=j && j!=k && i!=k) {
						result.add(""+s.charAt(i)+s.charAt(j)+s.charAt(k));
					}
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(permute("abc"));
	}
}
