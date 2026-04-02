package exceptions;

public class TestBeta {
	public static void main(String[] args) {
		Beta b = new Beta() {
			@Override
			public void display() {
				try {
					System.out.println(10/0);
				}
				catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
				
			}
		};
		b.display();
	}
}
