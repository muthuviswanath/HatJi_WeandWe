
public class MoveZeroes {

	//Double Pass Solution:
	static void moveZeroesToEnd(int arr[]) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		while(index < arr.length) {
			arr[index++] = 0;
		}
	}
	
	static void moveZeroesToEndSinglePass(int arr[]) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index++] = temp;
				
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {1,13,0,34,3,0,5,0,6};
		System.out.println("Before moving zero from the elements:");
		ArrayOps.printArray(a);
		moveZeroesToEndSinglePass(a);
		System.out.println("After moving zero from the elements:");
		ArrayOps.printArray(a);
		
	}
}
//Given a array of positive integers, move only the zeroes to the end of
// the array while retaining the other elements as it is.

/*
 * a = {1,13,0,34,3,0,5,0,6}
 * result= {1,13,34,3,5,6,0,0,0}
 * 
 * given an array , rotate is k position towards left
 * ar = {1,2,3,4,5}
 * k = 2
 * result = {3,4,5,1,2}
 * 
 * */
