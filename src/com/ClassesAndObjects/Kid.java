/*
 * Overloading is about the same function have different signatures.
 * Method Overloading allows different methods to have the same name, but different signatures
 * Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding
 * Different Ways of Method Overloading in Java
			Changing the Number of Parameters.
			Changing Data Types of the Arguments.
			Changing the Order of the Parameters of Methods
 * Type conversion[low to high] -> byte>(short,character)>integer>long>float>double>object
 * we can overload main method
 * we can overload main method
 * Overriding is about the same function, same signature but different classes connected through inheritance.
 */

package com.ClassesAndObjects;

public class Kid {
	static String studyClass = "KiderGarden";
	String name;
	int age;
	
	public Kid(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void play() {
		System.out.println(this.name+" is playing");
		System.out.println(name+" age is "+age);
		this.printKid(this.name);
	}
	
	//changing the type of argument
	public void printKid(String name) {				
		System.out.println("Kid name :"+this.name);
	}
	
	//if argument type not matched it go to its higher data type
	public void printKid(int studying) {
		System.out.println("Kid is Studying :"+studying);
	}
}
