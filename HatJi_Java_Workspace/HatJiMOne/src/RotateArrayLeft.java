import java.util.Scanner;

public class RotateArrayLeft {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		//Resultant: rotated by k position k:2{ 3,4,5,1,2}
		Scanner scan = new Scanner(System.in);
		System.out.println("Array before rotation: ");
		ArrayOps.printArray(a);
		System.out.println("Enter the value for K to rotate k position left: ");
		int k = scan.nextInt();
		int n = a.length;
		//till k: 2
		for(int i=1; i<=k; i++) {
			int first = a[0];
			for(int j=0; j<n-1;j++) {
				a[j] = a[j+1];
				//Iteration 1 for k:2 {2,3,4,5,5}
				//Iteration 2 for k:2 {3,4,5,1,1}
			}
			a[n-1] = first;
			//Iteration 1 for k:2 {2,3,4,5,1}
			//Iteration 2 for k:2 {3,4,5,1,2}
		}
		
		System.out.println("Array after rotating "+ k + " position left: ");
		ArrayOps.printArray(a);
	}
}
