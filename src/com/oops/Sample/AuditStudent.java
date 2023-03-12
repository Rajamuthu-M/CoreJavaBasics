package com.oops.Sample;

public class AuditStudent extends ArrayStudent implements PrintStudent{
	String classLoc;
	int m1,m2,m3,m4,m5;
	public AuditStudent(String name, String classLoc,int m1,int m2,int m3,int m4,int m5) {
		this.name = name;
		this.classLoc = classLoc;
		this.m1 = m1; 
		this.m2 = m2;
		this.m3 = m3; 
		this.m4 = m4; 
		this.m5 = m5; 
				
	}
	public void gotoClass() {
		System.out.println("Go to the Auditorium..."+this.name);
	}
	public String toString() {
		String strObj = "AuditStudent name is "+this.name;
		return strObj;
	}
	public void printMarksheet() {
		float mark;
		mark = (m1+m2+m3+m4+m5)/totalSubjects;
		System.out.println("Mark = "+mark);
	}

}
