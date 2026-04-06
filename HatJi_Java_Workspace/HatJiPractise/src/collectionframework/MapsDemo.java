package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapsDemo {
	public static void main(String[] args) {
		Map<Integer, String> jersey = new HashMap<Integer, String>();
		jersey.put(18,"Virat Kohli");
		jersey.put(7,"Ronaldo");
		jersey.put(45,"Rohit Sharma");
		
		System.out.println(jersey);
		
		for (Map.Entry<Integer, String> ele:jersey.entrySet()) {
			System.out.println(ele.getKey() + " | " + ele.getValue());
		}
		
		//To extract the key alone use only key and to extract the values 
		// using keyset, use map.get(key)
		for(Integer key:jersey.keySet()) {
			System.out.println(key + " => " + jersey.get(key));
			
		}
		
		for(String name:jersey.values()) {
			System.out.println(name);
		}
		
		//Using foreach method and lambda expression
		
		jersey.forEach((jno, pname)->{
			System.out.println(jno + " <-> " + pname);
		});
		
		//Using Iterator
		Iterator<Map.Entry<Integer, String>> iterator = jersey.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> ent = iterator.next();
			System.out.println(ent.getKey() + " - " + ent.getValue());
			
		}
		//Using Stream API
		
		jersey.entrySet()
				.stream()
				.forEach(e -> System.out.println(e.getKey() + " || " + e.getValue()));
		
		jersey.entrySet()
		.stream()
		.filter(e -> e.getKey() < 18)
		.forEach(e -> System.out.println(e.getKey() + "==" + e.getValue()));
	}
}
