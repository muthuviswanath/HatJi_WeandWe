package collectionframework;

import java.util.ArrayList;

public class Collect {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a = 45;
		al.add(23);//auto boxed : Converting the primitive data type to non-primitive
		al.add(a);//auto boxed
		
		//int size(); length / current size of the collection
		//boolean isEmpty(); whether the collection is empty or not
		//boolean contains(Object o); Check whether a specific object is present in the collection
		//Object[] toArray() Convert the collection into Array
		//boolean add(E e) To add element into the collection
		//boolean remove(Object o) To remove an object from the collection
		//boolean containsAll(Collection <?> c) To check whether a collection contains another collection
		//boolean addAll(Collection<? Extends E>c) To add another collection
		//boolean removeAll(Collection <?> C) To remove a collection that is present in another collection
		//boolean retainAll(Collection <?> C) To retain the collection that is mentioned
		//void clear() to remove everything from the collection
	}
}
