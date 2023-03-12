package com.oops.Sample;
import java.util.ArrayList;

public class StudentList {
	ArrayList<ArrayStudent> studList;;
	public StudentList() {
		System.out.println("Creating students list...");
		studList = new ArrayList<>();
	}
	public void addStudent(ArrayStudent student) {
		System.out.println("Add students to list....");
		studList.add(student);
	}
	public ArrayList<ArrayStudent> getStudents() {
		return studList;
	}
	
}