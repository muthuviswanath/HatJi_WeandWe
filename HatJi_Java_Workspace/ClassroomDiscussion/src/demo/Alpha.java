package demo;

public class Alpha {

	int age;
	static double average = 34.56;
	private String name = "Tesla";
	String dept;
	Alpha(int age, String dept){
		this.age = age;
		this.dept = dept;
				
	}
	Alpha(){
		
	}
	
	void display() {
		System.out.println("Welcome to the world of Java");
	}
	
	final void show() {
		System.out.println("Java Wonders");
	}
	
	static void run() {
		System.out.println("Run");
	}
	
}
