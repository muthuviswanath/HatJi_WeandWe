
public class StaticNonStatic {
	int age;
	static int roll;
	
	void display() {
		System.out.println(roll);
		System.out.println(this.roll);
		System.out.println(age);
		System.out.println(this.age);
	}
	
	void check() {
		display();
		this.display();
		run();
		this.run();
	}
	
	static void run() {
		System.out.println(roll);
		StaticNonStatic cl = new StaticNonStatic();
		System.out.println(cl.age);
	}
	public static void main(String[] args) {
		System.out.println(roll);
		StaticNonStatic cl = new StaticNonStatic();
		System.out.println(cl.age);
		cl.display();
		run();
	}
}
