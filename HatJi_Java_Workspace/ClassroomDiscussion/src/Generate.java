/*
 * Generate unique 3 digit numbers only using the numbers 1,2,3 and 4
 * 
 * 1 2 3
 * 1 2 4
 * 1 3 2
 * 1 3 4
 * 1 4 2
 * 1 4 3
 * 2
 * 3
 * 4
 * */


public class Generate {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				for (int k = 1; k <=4; k++) {
					//check for the condition and print
					if(i!=j && i!=k && j!=k) System.out.println(""+i+j+k);
				}
			}
		}
	}
}
