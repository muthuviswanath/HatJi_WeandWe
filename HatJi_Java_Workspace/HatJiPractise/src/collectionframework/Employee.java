package collectionframework;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}

class Manager extends Employee{

	public Manager(int empId, String empName) {
		super(empId, empName);
	}
	
}

class Tesla{
	int empId;
	String empName;
	
	public Tesla(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}
