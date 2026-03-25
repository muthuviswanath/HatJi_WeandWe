/* 1,1
 * 1,2
 * 1,3
*/

/*
 * Create a program to find whether a number is prime
 * Get input from the user and express the number as sum of two primes
 * 
 * 10 = 3 + 7
 * 10 = 5 + 5
 * 10 = 7 + 3
 * 
 * 
 * */

import java.util.Scanner;

public class ForLoops {
	static boolean isPrime(int n) {
		int factors = 0;
		for (int i=1; i<=n; i++) {
			if(n%i==0) factors++;
		}
		return true?factors == 2:false;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		for(int i=2; i<=n; i++) {
			if(isPrime(i) && isPrime(n-i)) {
				System.out.println(n + " = " + i +" + " +(n-i));
			}
		}
	}
}