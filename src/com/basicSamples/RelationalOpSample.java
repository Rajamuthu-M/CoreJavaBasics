package com.basicSamples;

public class RelationalOpSample {
	
	public static void main(String[] args) {
		int a = 7, b = 11;
		System.out.println("a is " + a + " and b is " + b);
		
		//*****Relational Operator*******
		// Equal to operator
		System.out.println(a == b);// false         
		
		// Not Equal to operator
		System.out.println(a != b);// true         
		
		// Greater than operator
		System.out.println(a > b);// false         
		
		// Less than operator
		System.out.println(a < b);// true         
		
		// Greater than or equal to operator
		System.out.println(a >= b);// false         
		
		// Less than or equal to operator
		System.out.println(a <= b);// true 
		
		//*****Logical Operator*******
		// Logical AND operator
		System.out.println((5 > 3) && (8 > 5));// true
		System.out.println((5 > 3) && (8 < 5));// false 
		
		// Logical OR operator
		System.out.println((5 < 3) || (8 > 5));// true
		System.out.println((5 > 3) || (8 < 5));// true
		System.out.println((5 < 3) || (8 < 5));// false     
		
		// Logical NOT operator
		System.out.println(!(5 == 3));// true
		System.out.println(!(5 > 3)); // false
		
		//*****Bitwise Operator*******
		// Bitwise AND operator
		System.out.println((5 > 3) & (8 > 5));	// true
		System.out.println(3&5);				// false 
				
		// Bitwise OR operator
		System.out.println((5 < 3) | (8 > 5));	// true
		System.out.println(5|3);				// true  
			
		// Bitwise XOR operator
		System.out.println(5^3);				// true
		
		// Bitwise XcomplementOR operator
		System.out.println(~3);					// true
		
		//*****Shift Operator*******
		//Signed right shift operator
		System.out.println(10<<1);
		
		//Unsigned right shift operator
		System.out.println(10>>1);
		
		//Left shift operator
		System.out.println(10>>>3);
		
		//*****Instanceof Operator*******
		// To test if an object is instance of a class, subclass or an interface.
		RelationalOpSample obj1 = new RelationalOpSample();
		OperatorSample obj2 = new OperatorSample();
//		RelationalOpSample obj3 = new person();
		System.out.println(obj1 instanceof RelationalOpSample);
		System.out.println(obj2 instanceof OperatorSample);
//		System.out.println(obj2 instanceof RelationalOpSample); //false
//		System.out.println(obj3 instanceof RelationalOpSample); //true
//		System.out.println(obj3 instanceof OperatorSample); //false
	}
	
}
	