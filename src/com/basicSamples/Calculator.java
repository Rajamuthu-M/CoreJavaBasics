package com.basicSamples;

public class Calculator {
	
	int a;
	int b; 								//instance variable
	final double pi = 3.14;
	static int c; 						//class variable
	
	public void add(int a, int b) {		//Parameterized variable
		int sum; 						//local variable
		sum = a+b;
		System.out.println("Sum = "+sum);
	}
	
	public static void main(String[] args) {
		Calculator caobj = new Calculator();
		caobj.add(1,2);
		caobj.area(10);
	}
	
	public void area(double radius) {
		double area = pi*radius*radius;
		System.out.println("Area of cicle = "+area);
	}
	
}
