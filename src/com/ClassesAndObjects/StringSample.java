/*
 * String objects are stored in a special memory area known as string constant pool.-same value in one
 * Firstly JVM will not find any string object with the value “Welcome” in the string constant pool, so it will create a new object.
 * <String_Type> <string_variable> = "<sequence_of_string>"; 
 * String s1 = new String("example"); -> it creates 2 object.1st object created in heap.2nd created in SCP
 * StringBuffer is a peer class of String that provides much of the functionality of strings
 * StringBuffer represents growable and writable character sequences.
 			StringBuffer s = new StringBuffer("GeeksforGeeks");
 * StringBuilder class provides an alternative to String Class, as it creates a mutable sequence of characters.
 			StringBuilder str = new StringBuilder();
			str.append("GFG");
 * StringTokenizer class in Java is used to break a string into tokens. 
 * 
 * https://practice.geeksforgeeks.org/courses/Java-Programming-basic-to-advanced?utm_source=geeksforgeeks&utm_medium=in_article_native&utm_campaign=targetcourse
 */

package com.ClassesAndObjects;

public class StringSample {
	public static void main(String[] args) {
		//Scanner input = new Scanner (System.in);
		String strOne = "Java";
		System.out.println(strOne.hashCode());
		strOne = strOne + " Programming";
		System.out.println("strOne :"+strOne );
		System.out.println(strOne.hashCode());
		strOne = strOne.concat(" Language");					
		System.out.println("strOne :"+strOne );
		System.out.println(strOne.hashCode());
		
		String strTwo = new String("Functinal Programming");
//		strTwo.concat("Language");			 //does not concatenating without assigning
		strTwo = strTwo.concat(" Language"); //need to assign
		System.out.println("strTwo :" +strTwo);
		System.out.println(strTwo.hashCode());
		
		String first = "Java Programming";
		String second = "Java Programming";
		String third = "JAVA";
		
		System.out.println(first.charAt(3));
		System.out.println(first.split(" "));
		
		boolean result1 = first.equals(second);
		System.out.println("1 equals 2 : "+result1);
		
		boolean result2 = third.equals(second);
		System.out.println("2 equals 3 : "+result2);
		
		String sampl ="Programming";
		sampl = sampl.concat(" Language");
		System.out.println(sampl);
		
		System.out.println(strOne.length());
		
		String hi = "Hi, ";
		String mom = "mom";
		hi = hi + mom;
		System.out.println(hi);
		hi = hi.concat(mom);
		System.out.println(hi);
		
		
		

	}
	

}
