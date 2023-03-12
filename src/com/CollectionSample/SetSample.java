package com.CollectionSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(6);
		evenNumber.add(6);
		System.out.println(evenNumber);
		
		//calling iterator() method
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumber);
		numbers.add(5);
		numbers.add(8);
		System.out.println("New HashSet + "+numbers);
		Iterator<Integer> iterate = numbers.iterator();
		System.out.println("HashSet using Iterator : ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next()+ ",");
		}
		
		boolean value1 = numbers.remove(5);
		System.out.println("\n 5 removed"+ value1);
		
		boolean value2 = numbers.removeAll(numbers);
		System.out.println("all elements removed"+ value2);
		
		HashSet<String> empList = new HashSet<>();
		empList.add("Raj");
		empList.add("Ram");
		System.out.println(empList);
		
		TreeSet<String> empList1 = new TreeSet<>();
		empList1.add("Raj");
		empList1.add("Raja");
		System.out.println(empList1);
	}
}