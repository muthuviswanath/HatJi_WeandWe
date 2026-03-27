package demo;

public class Implementation {
	
	public static void main(String[] args) {
		Beta b = new Beta();
		b.display();
		
		System.out.println(b.age);
		b.age = 100;
		System.out.println(b.age);
		
		System.out.println(b.average);
		b.average = 123456.78;
		System.out.println(Alpha.average);
		
		b.show();
		Beta.run();
		Alpha.run();
		
		
		
	}
}
