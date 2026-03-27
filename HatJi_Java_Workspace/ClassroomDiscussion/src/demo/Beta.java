package demo;
/*
 * Inheritance:
 * 	It is a phenomenon where the properties and behaviors of one
 *  class is acquired by another.
 *  
 *  The class whose properties and behaviors are acquired is called
 *  as base/parent/super class
 *  
 *  The class which acquires the properties and behaviors is called
 *  as derived/child/sub class
 *  
 *  Automatically all the instance methods and variables are inherited
 *  
 *  Static variables are allowed to be used in sub class
 *  
 *  Overriding is allowed only for instance methods and not for static methods
 *  
 *  A method with final access modifier cannot be overridden
 *  
 *  A method/variable that is private cannot be accessed by the sub class
 *  
 *  Once the method is overridden, the implementation of the overridden method
 *  always happens from the sub class when a method call is performed.
 *  
 *  Constructors are not part of inheritance, because it cannot be overridden
 *  
 *  A class that is marked as final cannot be inherited
 *  
 *  In case of inheritance, the first line of the constructor will be a super(). So, 
 *  while performing inheritance the base constructor has to be chained to the 
 *  derived constructor.
 *  
 *  super keyword will be used to access the super class properties and behaviors
 *  explicitly
 *  
 *  Even though it is possible by programmers to create the object of the super class,
 *  it is not recommended to do so as it doesn't make any sense in real world.
 *  
 *  To inherit the properties and behaviors of the super class, the subclass uses the
 *  keyword extends.
 *  
 *  At any point of time, a sub class can inherit only one super class
 *  
 *  Overriding Rules:
 *  1. The access specifier should be of the same visibility or higher
 *  2. The method along with its signature cannot be modified
 * */
public class Beta extends Alpha{
	
	Beta(int age, String dept){
		super(age,dept);
	}
	
	Beta(){
		this(25,"Finance");
	}
	
	@Override
	void display() {
		System.out.println("Super class method definition:");
			super.display();
		System.out.println("Definition from Beta Class");
		System.out.println(this.age);
		
	}
	
	static void run() {
		System.out.println("Welcome");
	}

}
