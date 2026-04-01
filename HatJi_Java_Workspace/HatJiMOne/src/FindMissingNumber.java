/*
 * Given an array of n positive integers, find the missing number
 * */
public class FindMissingNumber {
	//Time complexity: O(n^2)
	static void mssingNumber(int arr[], int n) {
		for(int i=1; i<= n; i++) {
			boolean found = false;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == i) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("Missing number:" + i);
			}
		}
	}

	static void missingBySort(int arr[], int n) {
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length -i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}

		for(int i=0; i<arr.length; i++) {
			if(arr[i] != i+1) {
				System.out.println("Missing number: " + (i+1));
				return;
			}
		}
	}


	static void missingByHash(int[] arr, int n) {
		boolean [] present = new boolean[n+1];
		for(int i=0; i<arr.length; i++) {
			present[arr[i]] = true;
		}

		for(int i=1; i<n; i++) {
			if(!present[i]) {
				System.out.println("Missing number: " + i);
				return;
			}
		}

	}

	static void missingByXOR(int[] arr, int n) {
		int xor_one = 0;
		int xor_two = 0;

		for(int i=1; i<= n; i++) {
			xor_one ^= i;
		}

		for(int i=0; i<arr.length; i++) {
			xor_two ^=arr[i];
		}

		System.out.println("Missing Value:"  + (xor_one ^ xor_two));
	}

	static void missingInPlace(int [] arr, int n) {
		for(int i=0; i<arr.length; i++) {

			int index = Math.abs(arr[i]) -1 ;
			if(index <arr.length && arr[index] > 0) {
			arr[index] = -arr[index];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println("Missing number: " + (i+1));
				return;
			}
		}

	}

	public static void main(String[] args) {
		int a[] = {1,5,2,4,3,7,8,9,10};
		missingInPlace(a,10);
	}
}
