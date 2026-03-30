package demo;

public class TstDoable implements Doable{

	@Override
	public void show() {
		System.out.println("Hello");		
	}

	public static void main(String[] args) {
		TstDoable td = new TstDoable();
		td.show();
	}
}
