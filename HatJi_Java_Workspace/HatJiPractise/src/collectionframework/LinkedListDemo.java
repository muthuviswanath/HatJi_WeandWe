package collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {
	//Maintains the insertion order
	//It is not index based collection
	//It can contain duplicates
	//It maintains the insertion order
	//The manipulation will be faster as there is no shift operations
	//Linked list can act as a list, or queue or stack
	//It has two constructors
	// 
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(10);llist.add(11);llist.add(12);
		System.out.println(llist.get(2));
		
	}
}

/*
 * 														Iterable
 * 	
 * 
 * 
 * 														Collection
 * 
 * 
 * 					List																	Queue
 * 
 * 
 * 																							Deque
 * 				AbstractSequentialList
 * 
 * 
 * 										extends							implements
 * 													LinkedList				
 * */
