package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpPayroll {
	public static void printEmpData(List<? extends Employee> emplist) {
		for(Employee e: emplist) {
			System.out.println(e.empId);
			System.out.println(e.empName);
		}
	}
	
	public static List addEmployee(List<? super Employee> mgrlst) {
		return mgrlst;
	}
	
	public static void main(String[] args) {
		
		Manager mgr_1 = new Manager(234, "Modi");
		Manager mgr_2 = new Manager(1234, "Sachin");
		List<Employee> e = new ArrayList<Employee>();
		e.add(mgr_1);
		e.add(mgr_2);
		List t = addEmployee(e);
		printEmpData(t);

//		printEmpData(tesla); 
		
	}
}
