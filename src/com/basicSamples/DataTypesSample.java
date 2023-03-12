/* Address is called as reference.
 * Two categories of data types - primitive, reference(Non-Primitive).
 * Reference data types contains memory address of variable values won't store the variable value directly in memory.
 * Data type determines the value that variable can contain and operation that can be performed on it.
 * Java is Statically and also strongly typed language - each variable and expression  type is already known at compile time.
 * Primitive - (boolean){Boolean type},(char)Character value,{Numeric type},(int,short,byte,long)Integer [Integral value] Floating point(float,double).
 * Non-Primitive - String, Array, Object, Class, Interface.
 * Class - Modifiers, Class name, Superclass, Interfaces, Body.
 * Object - State, Behavior, Identity.
 */

package com.basicSamples;

public class DataTypesSample {
	
	public static void main(String[] args) {
		
		// {1bit -> true or false} value of boolean aren't converted to any other type implicitly & explicitly with casts
		boolean b = true;					//Boolean by default value - false
		
		// {1byte -> -128 to 127} Default value = 0.
		byte d = 126;
		
		// {4byte -> -2147483648 to 2147483647} Default value = 0.
		int a;												//Declaration of variable
		a=1;												//Assigning value to variable
		int irange = -2147483648;
		
		// {8byte -> -9223372036854775808 to 9223372036854775807} Default value = 0.
		long lrange = -9223372036854775808L;				//Long value should be ended with L
		
		// {2byte -> -32768 to 32767} Default value = 0.
		short temperature = -200;
		
		//BigDecimal class for more accurate decimal value because float & double are rounding off error.
		// {8byte -> -9223372036854775808 to 9223372036854775807} Default value = 0.0 Values upto 16 digit.
		double myDouble =3.112233445566778899;				//Declaring variable with assigning a value
		double myDoubleScientific = 3.44e5;					//Double
		
		// {4byte ->  -2147483648 to 2147483647} Default value = 0.0 Values upto 7 digit
		float myFloat = 3.5566778899f;						//Float value should be ended with f
		
		
		//{2byte -> '\u0000'(0) to '\uffff'(65535)} Default value = '\u0000'
		// Java use Unicode defines fully international character such as latin, Greeks, Cyrillic,Arabic,Katakan,...
		char letter = 'c'; 									//Character
		
		//array of characters
		String s = new String ("Hello");					//String with using new operator
		String str1 = "JavaC"; 								//String without using new operator
		
		int biNumber = 0b10010;								//0b represents Binary
		int octNumber = 027;								//Octal starts with 0
		int hexNumber = 0x2F;								//0x represents Hexadecimal
		
		System.out.println("Boolean b = "+b);
		System.out.println("Byte d = "+d);
		System.out.println("int a = "+a);
		System.out.println("Double myDouble = "+myDouble);
		System.out.println("Float myFloat = "+myFloat);
		System.out.println("Double myDoubleScientific = "+myDoubleScientific);
		System.out.println("Characte letter = "+letter);
		System.out.println("String str1 = "+str1);
		System.out.println("String s = "+s);
		System.out.println("Integer irange = "+irange);
		System.out.println("Long lrange = "+lrange);
		System.out.println("short temperature = "+temperature);
		System.out.println("integer binary biNumber = "+biNumber);
		System.out.println("Integer Octal octNumber = "+octNumber);
		System.out.println("Integer hexa hexNumber = "+hexNumber);
		
	}

}
