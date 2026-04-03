package collectionframework;

import java.util.ArrayList;

public class AlistDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//To add data into arraylist
		al.add(10);al.add(true);al.add(23.45);al.add("Muthu");
		
		//To insert an element at a specific index
		al.set(2, "Inserted Element");
		
		//To add another list of values
		
		ArrayList all = new ArrayList();
		//To add data into arraylist
		all.add(10);all.add(true);all.add(23.45);all.add("Rahul");
		
		al.addAll(all);
		al.set(2, all);
		System.out.println(al);

		
		al.addAll(3,all);
		System.out.println(al);
		
		al.set(1, false);
		System.out.println(al);
		
		//add(e)	Adds element at the end
		//add(index, ele) -Insert element at a specific index
		//set(index, ele)-Insert element at a specific index
		//set(index,c) - Add the collection as a list in the given index
		//addall(c) - Add the collection at the end
		//addall(index,c) - Add the collection as a regualr elemets from that index
		
		
		al.remove(10);
		System.out.println(al);
		
		//If the element is the integer value, to remove it
		al.remove(Integer.valueOf(10));
		System.out.println(al);
		
		
		
		//Search
		System.out.println(al.contains("Muthu"));
		System.out.println(al.indexOf("Rahul"));
		System.out.println(al.lastIndexOf("Rahul"));
		
		//Size & capacity
		al.add(10);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.trimToSize();
		System.out.println(al.size());
		al.clear();
		System.out.println(al);
		
		
		
		
	}
}
