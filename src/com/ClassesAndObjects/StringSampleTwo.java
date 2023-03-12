package com.ClassesAndObjects;

import java.util.Arrays;

public class StringSampleTwo {

	public static void main(String[] args) {
		String type = "Java Programming";
		
		String one = "God is good";
		String two = "is god good";
	
		one = one.toLowerCase();
		two = two.toLowerCase();
	
		//Checking the lenght of strings are same
		if(one.length()==two.length()) {
		
			//convert to char array
			char[] charArray1 = one.toCharArray();
			char[] charArray2 = two.toCharArray();
		
			//sorting of char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
		
			//if sorted are  same string is anagram
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(one+ " and " + two + " are an anagram");
			}
			else {
				System.out.println(one+ " and " + two + " are not an anagram");
			}
		}
	
		System.out.println(one);
		System.out.println(two);	
		System.out.println("Legth of the String = "+one.length());	
		String concatination = one.concat(two);
		System.out.println(concatination);

	}

}
