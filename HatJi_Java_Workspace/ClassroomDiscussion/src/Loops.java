import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i= s.nextInt();
		while (i !=0) {
			System.out.println(i);
			i /= 10;
		}
		
		for(;i!=0;i/=10) {
			System.out.println(i);
		}
//		while(true) {
//			System.out.println();
//		}
//		
//		for(;;)
//		{
//			System.out.println();
//		}
		String st[] = {"Java", "Welcome"};
		for(String c: st) {
			
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		// MRO - Method Resolution Operator
		
		
	}
}
