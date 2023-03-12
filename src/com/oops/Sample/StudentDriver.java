package com.oops.Sample;
import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayStudent s1 = new PayingStudent("Peter",9.3f,98,89,67,89,67);
		ArrayStudent s2 = new CompanyStudent("John","Zuci",56,87,98,78,56);
		ArrayStudent s3 = new PayingStudent("Vicky",8.5f,56,78,87,98,89);
		ArrayStudent s4 = new CompanyStudent("Raj","Zuci",66,99,90,78,80);
		ArrayStudent s5 = new AuditStudent("Kiran","Auditoriam1",56,80,76,78,86);
		StudentList students = new StudentList();//array list of students
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		System.out.println("Object of s1..."+s1.toString());
		System.out.println("Object of s2..."+s2.toString());
		System.out.println("Object of s3..."+s3.toString());
		System.out.println("Object of s4..."+s4.toString());
		System.out.println("Object of s5..."+s5.toString());
	
		ArrayList<ArrayStudent> studs = students.getStudents();
		for(ArrayStudent stud : studs) {
			stud.gotoClass();
			System.out.println(stud.toString());
			System.out.println();
//			System.out.println(stud.printMarksheet());
		}
	}
}
