package collectionframework;

import java.util.Stack;
import java.util.Vector;

public class VectorDemo {
//Vector has 4 constructors
// 	vector()
//	vector(initial capacity)
//	vector(initial capacity, capacity increment)
//	vector(collection <? extends E> c)
	
	public static void main(String[] args) {
		Vector<String> vect = new Vector<String>();
		vect.addFirst("Welcome");
		vect.addLast("Tesla");
		vect.add("Microsoft");
		vect.addElement("IBM");
		System.out.println(vect);
		System.out.println(vect.size());
		System.out.println(vect.capacity());
		System.out.println(vect.get(2));
		System.out.println(vect.elementAt(3));
		
		Stack<Integer> st = new Stack<Integer>();
		st.add(null);
	}
}
