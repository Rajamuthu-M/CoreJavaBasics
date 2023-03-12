/*
 * Student[] arr = new Student[5]; //student is a user-defined class
 * student Array contains five memory spaces in each of the size of student class, address of five Student objects can be stored.
 * Student objects have to be instantiated using the constructor of the Student class, and their references should be assigned to the array elements
 * Instantiate in Java means to call a constructor of a Class which creates an an instance or object.
 * ArrayIndexOutOfBoundsException - if we try to access elements outside the array size
 * int[][] intArray = new int[10][20]; //a 2D array or matrix
   int arr[][]= { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } }; // declaring and initializing 2D array     
 * int[][][] intArray = new int[10][20][10]; //a 3D array
 *
 * */
package com.ClassesAndObjects;
 

public class ArrayOfObjectSample {
    public static void main(String[] args)
    {
        // declares an Array of Object.
        ArrayStudent[] arr;
  
        // allocating memory for 5 objects of type ArrayStudent.
        arr = new ArrayStudent[5];
  
        // initialize the elements of the array
        arr[0] = new ArrayStudent(1, "aman");
        arr[1] = new ArrayStudent(2, "vaibhav");
        arr[2] = new ArrayStudent(3, "shikar");
        arr[3] = new ArrayStudent(4, "dharmesh");
        arr[4] = new ArrayStudent(5, "mohit");
        
//    	// declares an Array and initializing  the elements of the array
//    	ArrayStudent[] arr = {new ArrayStudent(1,"Dharma"),new ArrayStudent(2,"sanvi"),new ArrayStudent(3,"Rupa"),new ArrayStudent(4,"Ajay")};
  
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "+ arr[i].roll_no + " " + arr[i].name);
    }
}