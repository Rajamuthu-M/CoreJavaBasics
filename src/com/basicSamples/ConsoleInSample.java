package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer : ");
		int number = input.nextInt();
		System.out.println("Entered Integer : "+number);
		
		System.out.print("Enter Float : ");
		float myFloat = input.nextFloat();
		System.out.println("Entered Float: "+myFloat);
		
		System.out.print("Enter Long : ");
		long mobileNo = input.nextLong();
		System.out.println("Entered long : "+mobileNo);
		
		System.out.print("Enter Double : ");
		double myDouble = input.nextDouble();
		System.out.println("Entered Double : "+myDouble);
		
		System.out.print("Enter Text : ");
		String myString = input.nextLine();
		System.out.println("Entered Text : "+myString);
		
		System.out.print("Enter Gender : ");
		char gender = input.next().charAt(0);
		System.out.println("Entered Gender : "+gender);
		
		input.close();
	}

}
