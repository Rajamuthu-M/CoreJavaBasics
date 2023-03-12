/* An array is a group of similar data type variables
 * arrays are objects of a class
 * length keyword id used to get the of array [arrayName.length]
 * Every array has an associated Class object[intArray.getClass]
 * direct superclass of an array type is class Object.
 * array can contain primitives and object references of a class
 * In the case of primitive data types, the actual values are stored in contiguous memory locations.
 * In the case of class objects, the actual objects are stored in a heap segment.
 * Using primitive data types - byte byteArray[];
								short shortsArray[];
								boolean booleanArray[];
								long longArray[];
								float floatArray[];
								double doubleArray[];
								char charArray[];
 * Using objects - MyClass myClassArray[]; 
				   Object[]  ao,        // array of Object
				   Collection[] ca;  // array of Collection of unknown type
 * int intArray[];    //declaring array
   intArray = new int[20];  // allocating memory to array
   int[] intArray = new int[20]; // combining both statements in one
   int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };  // Declaring array literal
 * Student[] arr = new Student[5]; //student is a user defined class
 * Cloning of arrays - int intArray[] = { 1, 2, 3 };
                       int cloneArray[] = intArray.clone();
                       System.out.println(intArray == cloneArray);       -> false
                       System.out.println(intArray[0] == cloneArray[0]); -> true
 */
 

package com.ClassesAndObjects;

public class ArraysSample {

	public static void main(String[] args) {
		int[] age = {12,23,34,43,21};  //declaring and initialization //int age[];
		System.out.println(age[3]);
		
		System.out.println("Using for Loop");
		for (int i=0;i<age.length;i++) {
			System.out.println("index ["+i+"] : "+age[i]);
		}
		
	    /*	
		System.out.println("Using for-each Loop");
		for (int a : age) {
			System.out.println(age);
		}
		*/
		
		int[] numbers = {1,2,3,4,5,6,9};	 //45-47,54-61 passing array to method
		//passing array to method sum	
		sum(numbers);
		
		int arr[] = m1();					 //49-51,63-67 Returning Arrays from Methods
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
	}
	
	public static void sum(int[] numbers) {
		int sum = 0;
		System.out.println("Total numbers = "+numbers.length);
		for (int number : numbers) {
			sum+=number;
		}
		System.out.println("Sum = "+sum);
	}
	
	public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }

}
