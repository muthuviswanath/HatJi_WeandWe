package assignment;

//Task 4: Fill an array with Amstrong Number given the size of the array is 20
//Task 5: Fill an array with Prime numbers that has a specific starting limit that is 
//taken as input from the user. The size of the array is also determined by the
//user.

//Enter the size of the array: 15
//Enter the starting limit of the prime number: 97

//Task 6: Fill the array of size 7 with EMIRP number
//An emirp number is a number where the number as well as its reversed form both
//are primes
//13 - Prime
//31 - Prime

public class Amstrong {
	static int power(int base, int expo) {
		int pow = 1;
		for (int i=1; i<= expo; i++) {
			pow = pow *base;
		}
		return pow;
	}
	static boolean isAmstrong(int num) {
		int temp1 = num, temp2 = num;
		int count = 0;
		while(temp1 !=0) {
			temp1 /= 10;
			count++;
		}
		int sum = 0;
		while(temp2!=0) {
			int digit = temp2 % 10;
			sum = sum + power(digit, count);
			temp2 /=10;
		}
		if(sum == num) 
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		int ams_array[] = new int[20];
		int count = 0;
		int num = 1;
		while(count <ams_array.length) {
			if (isAmstrong(num)) {
				ams_array[count++] = num;
			}
			num++;
		}
		
		System.out.println("List of Amstrong number Array:");
		for(int amsnum:ams_array) {
			System.out.println(amsnum + " ");
		}
	}
}
