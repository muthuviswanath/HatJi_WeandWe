package assignment;

import java.util.Scanner;

public class FillPrime {
	static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i=2; i<=num/2; i++) {
			if(num % i ==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the prime array");
		int size = s.nextInt();
		int [] prime_array = new int[size];
		
		System.out.println("Enter the starting limit: ");
		int start = s.nextInt();
		
		int count = 0;
		int num = start;
		
		while(count < size) {
			if(isPrime(num)) {
				prime_array[count++] = num;
			}
			num++;
		}
		
		System.out.println("Prime Array:");
		for(int ele:prime_array) {
			System.out.print(ele+" ");
		}
	}
}
