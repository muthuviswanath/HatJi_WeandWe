package assignment;

public class FillEmirp {
	static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i=2; i<=num/2; i++) {
			if(num % i ==0) return false;
		}
		return true;
	}
	static int reverse(int num) {
		int rev = 0;
		while (num !=0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

	static boolean isEmirp(int num) {
		if(!isPrime(num)) return false;
		int rev = reverse(num);
		if(rev == num) return false;
		return isPrime(rev);
	}
	public static void main(String[] args) {
		int emirp_array[] = new int[7];
		int count = 0;
		int num = 2;
		while(count < emirp_array.length) {
			if(isEmirp(num)) {
				emirp_array[count++] = num;
			}
			num++;
		}
		System.out.println("Emirp number array:");
		for(int e:emirp_array) {
			System.out.print(e+" ");
		}
	}
}
