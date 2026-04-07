import java.util.Scanner;

public class AlternateVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}

		for(int i=0; i<n; i++) {
			String s = arr[i];
			boolean valid = true;
			for(int j=0; j<s.length(); j++) {
				char ch = Character.toLowerCase(s.charAt(j));
				boolean isVowel = (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
				
				if(j%2 == 0) {
					if(!isVowel) {
						valid = false;
						break;
					}
				}
				else {
					if(isVowel) {
						valid = false;
						break;
					}
				}
			}
			if(valid) {
				System.out.println(s);
			}
		}
	}
}
