package demo;

public class Employee {
	String name;
	int age;
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return this.name +" | "+(this.age + 10);
		
	}
	public static void main(String[] args) {
		String s = new String("Capgemini");
		Employee e = new Employee("Muthu", 42);
		System.out.println(s);
		System.out.println(e);
	}
}

/*
 * Object Class:
 * 
 * It is the supermost class in Java
 * By default it is the super class for all the classes that we create
 * It has 11 methods (including the overridden wait method)
 * It does not have any variables
 * 
 * */
