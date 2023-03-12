package com.ClassesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		
		//creating instance of EncapsulatedKid class
		EncapsulatedKid kidEn = new EncapsulatedKid();	//7-13 Encapsulated Class
		kidEn.setName("Raja");							// setting values of the variables
		kidEn.setAge(21);
		System.out.println(kidEn.getName());			// Displaying values of the variables
//		System.out.println(kidEn.name);					// Direct access is not possible due to encapsulation
		kidEn.play();
		System.out.println();

		Kid kidOne = new Kid("Pinky",8);
		kidOne.play();

		Kid kidTwo = new Kid("maddy",10);
		kidTwo.play();
		System.out.println(kidTwo.name);
		System.out.println("KidOne...."+kidOne.hashCode());
		System.out.println("KidOne...."+kidTwo.hashCode());
		
		kidOne = kidTwo;
		System.out.println("KidOne...."+kidOne.hashCode());
		System.out.println("KidOne name...."+kidOne.name);
		
		kidOne.printKid(10);
		System.out.println("All kids are in "+Kid.studyClass);
		
		kidTwo.printKid(10);
		

	}
}
