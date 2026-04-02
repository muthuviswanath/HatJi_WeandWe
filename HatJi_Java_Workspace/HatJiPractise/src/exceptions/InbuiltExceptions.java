package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InbuiltExceptions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,b=0;
		try {
			System.out.println("Enter the value of the first number in integer format:");
			a = s.nextInt();
			System.out.println("Enter the value of the second number in integer format:");
			b = s.nextInt();
			int c = a/b;
			System.out.println(c);
			int [] arr = new int[c];
			System.out.println(arr[2]);	

		}

		finally {
			System.out.println("Hello");
			s.close();
			try {}
			catch(Exception e) {}
		}

	}
}


