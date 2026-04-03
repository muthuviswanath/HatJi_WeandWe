package collectionframework;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.ensureCapacity(20);
		for(int i=0; i<50; i++) {
			lst.add(i);
		}
		System.out.println(lst.size());
		System.out.println(lst);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<=5; i++) {
			al.add(i);
		}	
		System.out.println(al.size());
		
		al.add(12);al.add(12);al.add(null);al.add(null);
		System.out.println(al.size());
	}
}
