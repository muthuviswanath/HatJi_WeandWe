import java.util.Scanner;

public class RorateArrayRight {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		//After rotating k position right with k:2
		//{4, 5, 1, 2, 3}
		Scanner scan = new Scanner(System.in);
		System.out.println("Array before rotation: ");
		ArrayOps.printArray(arr);
		System.out.println("Enter the value for K to rotate k position right: ");
		int k = scan.nextInt();
		int n = arr.length;
		k = k % n;
		for (int i=1; i<=k; i++) {
			int last = arr[n-1];
			for(int j = n-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		
		System.out.println("Array after rotating "+ k + " position right: ");
		ArrayOps.printArray(arr);
	}
}
