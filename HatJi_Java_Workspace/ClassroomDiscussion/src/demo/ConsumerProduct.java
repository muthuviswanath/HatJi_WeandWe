package demo;

public class ConsumerProduct {
	String name;
	int id;
	public ConsumerProduct(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		ConsumerProduct mazaa_1 = new ConsumerProduct("Maazaa", 123);
		ConsumerProduct mazaa_2 = new ConsumerProduct("Maazaa", 123);
		System.out.println(mazaa_1);System.out.println(mazaa_2);
		System.out.println(mazaa_1 == mazaa_2);
		System.out.println(mazaa_1.equals(mazaa_2));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if (obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		ConsumerProduct cp = (ConsumerProduct)obj;
		return this.id == cp.id && this.name.equals(cp.name);
		
	}
}

/*
 * If the content of the object and the object are the same, then their hashcode
 * should also be the same.
 * 
 * To ensure that the hashcode and the equals method has to be overridden
 * 
 * Rules to override equals method:
 * 
 * 1. Reflexive Property should be maintained
 * 		x.equals(x) = true
 * 2. Symmetric Property should be maintained
 * 		x.equals(y) == true then y.equals(x) should also be true
 * 3. Transitive Property should be maintained
 * 		if x = y and y = z then then x = z
 * 4. Consistent Property should be maintained
 * 		If the result is true for one comparison, then it should be true across
 * 		all the time when the comparison matches.
 * 5. Non-null Property should be maintained
 * 		x.equals(null) should always result in false
 * */
