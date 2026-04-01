package JavaStrings;

public class Irony {
	public static void main(String[] args) {
		String fact = "God Created Humans";
		//Reverse it such that we get the output:
		// Humans Created God
		String facts = "";
		String words[] = fact.split(" ");
		for(int i=words.length-1;i>=0; i--) {
			facts += words[i] +" ";
		}
		System.out.println(facts);
	}
}

// Task 1: Given two strings, find whether they are anagrams
// Task 2: Given a string check whether it is a panagram
// Task 3: Check whether the given string is a palindrome

// Task 4: Fill an array with Amstrong Number given the size of the array is 20
// Task 5: Fill an array with Prime numbers that has a specific starting limit that is 
// taken as input from the user. The size of the array is also determined by the
// user.

// Enter the size of the array: 15
// Enter the starting limit of the prime number: 97

// Task 6: Fill the array of size 7 with EMIRP number
// An emirp number is a number where the number as well as its reversed form both
// are primes
// 13 - Prime
// 31 - Prime
