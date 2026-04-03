package collectionframework;

import java.util.ArrayList;

public class TestColl {
	public static void main(String[] args) {
		Object obj[] = new Object[2];
		int[] a = {1,2,3,4};
		String[] b = {"a","b","c","d"};
		obj[0] = a;
		obj[1] = b;
		for(Object object:obj) {
			System.out.println(object);
		}
	}
}
