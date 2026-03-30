package demo;

public class TestDoable{



	public static void main(String[] args) {
		
		//Anonymous Inner Class
		Doable td = new Doable() { public void show() {
			System.out.println("Hello");
		}};
		td.show();
		
		
	}

}
