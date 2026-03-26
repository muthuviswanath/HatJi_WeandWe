//Create 3 students by getting the number of students from the user and the student
// details as well. Also display them immediately as soon as you get the details

import java.util.Scanner;

public class Students {

	int stud_id;
	String studname;
	String studegree;
	public Students(int stud_id, String studname, String studegree) {
		this.stud_id = stud_id;
		this.studname = studname;
		this.studegree = studegree;
	}
	
	void displaydetails() {
		System.out.println("Student Id: " + this.stud_id);
		System.out.println("Student Name: " + this.studname);
		System.out.println("Student Degree: " + this.studegree);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbe of students to be created: ");
		int stuno = s.nextInt();
		for (int i = 1; i<=stuno; i++) {
			System.out.println("Enter the Student " + i + " Id: ");
			int stdid = s.nextInt();
			System.out.println("Enter the Student " + i + " Name: ");
			String stdname = s.next();
			System.out.println("Enter the Student " + i + " Degree: ");
			String stddegree = s.next();
			Students stu = new Students(stdid,stdname,stddegree);
			stu.displaydetails();
		}
	}
}
