package com.oops.Sample;

public abstract class ArrayStudent implements PrintStudent {
	String name;
	String address;
	float gpa;	
	public ArrayStudent() {
	}
//	public Student(String name){
//		this.name = name;
//	}
//	public Student(String name, float gpa) {
//		this.name = name;
//		this.gpa = gpa;
	public final void calculateGPA() {
		System.out.println("Calculate GPA");
	}
	public abstract void gotoClass();

}
