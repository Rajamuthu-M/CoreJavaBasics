/*Encapsulation - protective shield that prevents the data from being accessed by the code outside this shield.
 *Data hiding concept which is achieved by making the members or methods of a class private and the class is exposed to the end-user without providing any details behind implementation using the abstraction concept.
 *it is also known as a combination of data-hiding and abstraction.
 *Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
 *It is more defined with the setter and getter method.
 */
 package com.ClassesAndObjects;


public class EncapsulatedKid {
	
	//these can only be accessed by public methods of class
		private String name; 
		private int age;
	
	// get method for name to access private variable name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = (name.length()==0)?"No name":name;
	}
 
	// get method for age to access private variable age
	public int getAge() {
		return age;
	}

	// set method for age to initialize value to private variable age
	public void setAge(int age) {
		this.age = (age > 1 && age<13)? age :20;
	}

	public void play() {
		System.out.println("Encapsulated Name : "+this.name);
		System.out.println("Encapsulated Age : "+this.age);
	}

}
