package com.basicSamples;

public class OperatorSample {
	
	public static void main(String[] args) {
		//*******Assignment Operator************
		int a=4,b,var;
		var = a;
		System.out.println("var using = : "+var);
		var += a;
		System.out.println("var using += : "+var);
		var *= a;
		System.out.println("var using *= : "+var);
		var -= a;
		System.out.println("var using -= : "+var);
		var /= a;
		System.out.println("var using /= : "+var);
		var %= a;
		System.out.println("var using %= : "+var);
		
		//*******Arithmetic Operator************
		b = a+var;
		System.out.println("var addition : "+b);
		b = a*var;
		System.out.println("var multiplication *= : "+b);
		b = a/var;
		System.out.println("var division /= : "+b);
		b = a%var;
		System.out.println("var modulo %= : "+b);
	}
	
}
