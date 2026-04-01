
public class ArrayOps {

	static void printArray(int arr[]) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i == arr.length-1)
				System.out.println("]");
			else
				System.out.print(", ");
		}
	}

	static int min(int arr[]) {
		int min = arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	static int max(int arr[]) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	//[10,5,6,10]

	static int second_largest(int arr[]) {
		int max = arr[0], second_max = Integer.MIN_VALUE;//6
		for(int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				second_max = max;
				max =arr[i];
			}
			else if(arr[i] > second_max && arr[i] != max){
				second_max = arr[i];
			}
		}
		return second_max;
	}

	static int second_smallest(int arr[]) {
		int min = arr[0], second_min = Integer.MAX_VALUE;
		for(int i=1; i<arr.length; i++) {
			if (arr[i] < min) {
				second_min = min;
				min =arr[i];
			}
			else if(arr[i] < second_min && arr[i] != min){
				second_min = arr[i];
			}
		}
		return second_min;
	}

	static void splitArray(int arr[], int element_count) {
		int a[] = new int[element_count];
		int b[] = new int[arr.length - element_count];

		for(int i=0; i<arr.length; i++) {
			if(i<element_count)
				a[i] = arr[i];
			else {
				b[i-a.length ] = arr[i];
			}
		}
		printArray(a);
		printArray(b);
	}

	static int [] mergeArray(int arr1[], int arr2[]) {
		int result[] = new int[arr1.length + arr2.length];
		for(int i=0; i<result.length; i++) {
			if(i < arr1.length)
				result[i] = arr1[i];
			else 
				result[i] = arr2[i-arr1.length];
		}
		return result;
	}

	static int [] mergeZigZagArray(int a[], int b[]) {
		int r[] = new int[a.length + b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j < b.length) {
			r[k++] = a[i++];
			r[k++] = b[j++];
		}

		while (i < a.length) {
			r[k++] = a[i++];
		}
		while (j < b.length) {
			r[k++] = b[j++];
		}
		return r;
	}
	
	static int [] mergeSortedArray(int a[], int b[]) {
		int r[] = new int[a.length + b.length];
		int i=0, j=0, k=0;
		while(i<a.length && j < b.length) {
			if(a[i] < b[j])
				r[k++] = a[i++];
			else
				r[k++] = b[j++];
		}

		while (i < a.length) {
			r[k++] = a[i++];
		}
		while (j < b.length) {
			r[k++] = b[j++];
		}
		return r;
	}

}
