
public class Charlie {

	Charlie(){
		this("test");
		System.out.println("Bye");
	}
	Charlie(String s){
		this(2);
		System.out.println(s);
		
	}
	Charlie(int a){
		System.out.println();
	}
	
	public static void main(String[] args) {
		Charlie c = new Charlie();
	}
}
//test
