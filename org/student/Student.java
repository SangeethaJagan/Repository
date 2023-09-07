package org.student;

import org.department.Department;

public class Student extends Department {
	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name : Sangeetha J");
		

	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department : Computer Science");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("My Student Id : 123456");

	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
	}
	

}
