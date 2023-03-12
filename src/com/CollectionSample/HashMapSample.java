package com.CollectionSample;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<Integer, String> Student = new HashMap<>();
		Student.put(143, "Raja");
		Student.put(141, "Raajesh");
		Student.put(145, "Rajkumar");
		System.out.println("HashMap :"+ Student);
		String value = Student.get(141);
//		get() method to get value
		System.out.println(value);
		// using Keyset()
		System.out.println("Keys:"+Student.keySet());
		System.out.println("Keys:"+Student.entrySet());
		
		String value1 = Student.remove(141);
		System.out.println(value1);
		
		

	}

}
