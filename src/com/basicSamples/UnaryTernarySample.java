package com.basicSamples;

public class UnaryTernarySample {

	public static void main(String[] args) {
		//***********Ternary Operator**************
		int odd = 23;
		String result;
		result = ((odd%2) == 0) ? "Even Number" : "Odd Number";
		System.out.println(result);
		
		int februaryDays = 28;
		result = (februaryDays == 29) ? "Leap Year" : "Not a Leap Year";
		System.out.println(result);
		
		//************Unary Operator***************
		int a = 7, b = 11;
		System.out.println("a is " + a + " and b is " + b);
		
		//Unary minus
		System.out.println("minus = "+(a-b));
		
		//Unary plus
		System.out.println("plus = "+(a+b));
		
		//increment operator
		System.out.println("Actual value = "+a);
		System.out.println("Post Increment = "+(a++));
		System.out.println("pre Increment = "+(++a));
		
		//decrement operator
		System.out.println("Actual value = "+a);
		System.out.println("Post Decrement = "+(a--));
		System.out.println("pre Decrement = "+(--a));
		
		//logical not operator
		boolean c = true;
		System.out.println("Actual value = "+c);
		System.out.println("boolean c = "+(!c));
	}

}
