package stringpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Group Anagrams

Function Signature: List<List<String>> groupAnagrams(String[] strs)
Sample Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Sample Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]] (Grouped anagrams.)
 */
public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String word:strs) {
			int[] count = new int[26];
			for(char c: word.toCharArray()) {
				count[c-'a']++;
			}
			String key = Arrays.toString(count);
			map.computeIfAbsent(key,k -> new ArrayList<>()).add(word);
			
		}
		return new ArrayList<>(map.values());
	}
	
	public static List<List<String>> groupAnagram(String[] strs){
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(String word:strs) {
			char[] c = word.toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
		}
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String[] inp = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(inp));
		System.out.println(groupAnagram(inp));
	} 
}
