package collectionframework;

public class Student <Id, Dept>{

	Id studentId;
	Dept department;
	
	public Student(Id studentId, Dept department) {
		this.studentId = studentId;
		this.department = department;
	}
	
	Object [] getValue(){
		Object[] obj = new Object[2];
		obj[0] =this.studentId;
		obj[1] =this.department;
		return obj;
	
	}
	
	
	
	public static void main(String[] args) {
	Student<Integer, String> stu = new Student<Integer, String>(123,"ECE");
	Object[] ob = stu.getValue();
	for(Object e: ob) {
		System.out.print(e +", ");
	}
	}
}
