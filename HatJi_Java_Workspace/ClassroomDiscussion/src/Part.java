
public class Part {
	/*Overloading Rules*/
	//The signature must be different
	// 1. If the number of parameters are same, either the order of the parameter 
	//	 should be different or the data type of the parameters should be different
	// 2. The number of parameters should differ

//	Part(int a){
//		System.out.println("Integer");
//	}
	Part(Number a){
		System.out.println("Number");
	}
	Part(Integer a){
		System.out.println("Float");
	}
	Part(Double d){
		System.out.println("Double");
	}
	public static void main(String[] args) {
		Part p = new Part(10);
	}
}
