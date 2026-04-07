import java.util.Scanner;

public class PalinCount {
	static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		s = s.replace(" ", "");

		int start = 0;
		int end = s.length()-1;

		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		String arr[] = new String[n];
		int count = 0;
		
		s.nextLine();
		for(int i=0; i<n; i++) {
			arr[i] = s.nextLine();
		}
		
		for(int i=0; i<n; i++ ) {
			if(isPalindrome(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
