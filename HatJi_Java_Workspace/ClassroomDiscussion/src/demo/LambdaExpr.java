package demo;

public class LambdaExpr {
	public static void main(String[] args) {
		Doable d = (x,y) -> {return x+y; };
		int result = d.show(10,20);
		System.out.println(result);
	}
}
