
public class Delta {
	static String s;
	Delta(){
		
		System.out.println("Call me if you can");
	}
	Delta(String a){ // a = null
		this();
		System.out.println("You can't do anything");
	}
	Delta(Integer a){ //a = 23
		this(s);//s = null
	}
	public static void main(String[] args) {
		
		Delta d = new Delta(23);
		
		
	}
}
/*
 * 1. this calling statement this() should be the first line inside a constructor 
 * 		in case of local chaining.
 * 2. this calling statement this() cannot take this as an argument
 * 3. Indirect arguments are not allowed (instance variable type)
 * 4. Indirect arguments of static types are allowed
 * 5. When the constructor has two non-primitive parameters, implement it carefully to
 *    avoid chaos or ambiguity
 * 
 * */
