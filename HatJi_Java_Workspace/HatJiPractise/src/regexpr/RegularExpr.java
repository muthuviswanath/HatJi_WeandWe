package regexpr;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Regular Expression API is present in java.util.regex
//MatchResult Interface
//Matcher Class
//Pattern Class
//PattenSyntaxException Class
public class RegularExpr {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");// represent a single char
		Matcher m = p.matcher("Tsc");
		boolean b = m.matches();
		System.out.println(b);
	}
}
//Matcher Class:
/*
 * boolean matches() - check whether the regular expression matches the pattern
 * boolean find()	 - find the next expression that matches the given pattern
 * boolean find(int index)
 * String group() - return the matched sequence
 * int start() -  return the starting index of the matched pattern
 * int end() - return the ending index of the matched pattern
 * int groupCount() - return the total number of matched patterns
 * */
