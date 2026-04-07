import java.util.Scanner;

public class CountOccurances {
	public static int countOccurance(String [] arr, String word) {
		int count = 0;
		word = word.toLowerCase();
		for(int i=0; i<arr.length; i++) {
			String sentence = arr[i].toLowerCase();
			String words[] = sentence.split(" ");
			
			for(int j=0; j<words.length; j++) {
				if(words[j].equals(word)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		System.out.println("Enter the word to be searched: ");
		String wrd = sc.next();
		
		int count = countOccurance(arr, wrd);
		System.out.println(count);
	}
}
