package com.oops.Sample;

public class CompanyStudent extends ArrayStudent implements PrintStudent {//if we not provide implementation for interface thent the class should be abstract
	String CompanyName;
	int m1,m2,m3,m4,m5;
	public CompanyStudent(String name,String CompanyName,int m1,int m2,int m3,int m4,int m5) {
		this.name = name;
		this.CompanyName = CompanyName ;
		this.m1 = m1; 
		this.m2 = m2;
		this.m3 = m3; 
		this.m4 = m4; 
		this.m5 = m5;
	}
	public void gotoClass() {
		System.out.println("Goto class after evaluation..."+this.name);
	}
	public String toString() {
		String strObj = "CompanyStudent name is "+this.name;
		return strObj;
	}
	public void printMarksheet() {
		float mark;
		mark = (m1+m2+m3+m4+m5)/totalSubjects;
		System.out.println("Mark = "+mark);
	}

}
