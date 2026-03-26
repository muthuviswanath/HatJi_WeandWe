
public class England {
	int age;
	{
		this.age = 10;
		System.out.println("Don't go for lunch");
	}
	{
		System.out.println("Welcome");
	}
	public England() {
		System.out.println(this.age);
	}
	static 
	{
		System.out.println("Today is Ram Navami");
	}
	static {
		System.out.println("Ugadi Celebrations are done");
	}
	public static void main(String[] args) {
		
		System.out.println("Time for Lunch");
		England e = new England();
	}
}

//Today is Ram Navami