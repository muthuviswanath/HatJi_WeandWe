package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class NumsList {
	public static void main(String[] args) {
		ArrayList<Integer> mynums = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			mynums.add(i*i);
		}

		System.out.println("Iterating throug regular loops");
		System.out.println("Using regular for: ");
		for(int i=0; i<mynums.size(); i++) {
			System.out.print(mynums.get(i)+" ");
		}
		System.out.println();

		int i=0;
		System.out.println("Using while: ");

		while(i<mynums.size()) {
			System.out.print(mynums.get(i)+" ");
			i++;
		}
		System.out.println();

		int j=0;
		System.out.println("Using do-while: ");

		do {
			System.out.print(mynums.get(j)+" ");
			j++;
		}while(j<mynums.size());
		System.out.println();

		System.out.println("Using for-each / enhanced for: ");

		for(int ele:mynums) {
			System.out.print(ele+ " ");
		}
		System.out.println();

		//Using Iterator
		System.out.println("Using Iterator: ");

		Iterator<Integer> itr = mynums.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println("Using ListIterator Forward Direction: ");
		ListIterator<Integer> liter = mynums.listIterator();
		while(liter.hasNext()) {
			System.out.print(liter.next()+" ");
		}
		System.out.println();
		
		
		System.out.println("Using ListIterator Reverse Direction: ");
		ListIterator<Integer> liter_rev = mynums.listIterator(mynums.size());
		while(liter_rev.hasPrevious()) {
			System.out.print(liter_rev.previous()+" ");
		}
		System.out.println();
		
		System.out.println("Using Method Reference Operator");
		mynums.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Using Stream API");
		
		mynums.stream().forEach(System.out::println);
	}
}
