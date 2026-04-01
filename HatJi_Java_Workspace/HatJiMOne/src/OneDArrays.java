import java.lang.reflect.Array;

public class OneDArrays {
	public static void main(String[] args) {
		//Array declaration with initialization
		int[] nums = {1,20,3,4,5}; 
		ArrayOps.printArray(nums);
		System.out.println("Min Element:"  + ArrayOps.min(nums));
		System.out.println("Max Element:"  + ArrayOps.max(nums));
		int even_count = 0, odd_count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] % 2 == 0)
				even_count++;
			else
				odd_count++;
		}
		System.out.println("Even element count: " + even_count);
		System.out.println("Odd element count: " + odd_count);
		System.out.println("Second Max: " + ArrayOps.second_largest(nums));
		System.out.println("Second Min: " + ArrayOps.second_smallest(nums));
		
		//Given an array of 15 elements get the value from the user on how
		// many elements he needs to store in the first array and move the
		// elements in the given array to the first array based on his choice
		// and the remaining to the second array
		
		int arr_one[] = {1,2,3,4,5,6,7,8,9,10};
		ArrayOps.splitArray(arr_one, 7);
		
		//Merge two arrays one after the other
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {34,56,23,546,67,456,9};
		int result[] = ArrayOps.mergeArray(arr1, arr2);
		ArrayOps.printArray(result);
		
		//[1,34,2,56,3,23,4,546,67,456,9]
		
		int r[]  = ArrayOps.mergeZigZagArray(arr1, arr2);
		ArrayOps.printArray(r);
		
		int a[] = {11,22,33,44,55,66};
		int []b = {13,25,37,41,53,68,89,97,112,134};
		
		//c = [11,13,22,25,33,37,41,44,53,55,66,68,89,97,112,134]
		int res[] = ArrayOps.mergeSortedArray(a, b);
		ArrayOps.printArray(res);
	}
	
}
