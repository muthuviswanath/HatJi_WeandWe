package collectionframework;

public class Utility {

	public <T, D, E, F> void printData(T data, D tata, E eta, F fanta) {
		System.out.println("Data Given: " + data + tata + eta + fanta);
	}


	public static void main(String[] args) {
		Utility u = new Utility();
		Prod p = new Prod("Mouse", 2233);
		u.printData(p, "Welcome", null, 4567.34);
		
	}
}
class Prod{
	String prodname;
	int prodid;

	Prod(String prodname,int prodid){
		this.prodname = prodname;
		this.prodid = prodid;
	}

	@Override
	public String toString() {
		return this.prodid + this.prodname;
	}
}

