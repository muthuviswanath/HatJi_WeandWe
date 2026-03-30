package demo;

public interface GoogleMaps {
	/*
	 * It is not possible to create an object of abstract class. That is, an abstract
	 * class cannot be instantiated.
	 * 
	 * An abstract class may or may not have abstract method.
	 * 
	 * If there is an abstract method persent, then the class must be an abstract class
	 * 
	 * An abstract class can have blocks, variables (private, protected, public), the 
	 * variables can be final variables as well. It can have both concrete as well as
	 * abstract method or any of them or nothing.
	 * 
	 * An abstract class can have user defined constructors too and they can be overloaded
	 * as well.
	 * 
	 * Using abstract class and interfaces, we can achieve 0 to 100% abstraction
	 * 
	 * */
	
	abstract void findDirections (String src, String destn);
	abstract void findshortestPath(String src, String destn);
	

}
