package com.CollectionSample;

import java.util.ArrayList;

import com.oops.Sample.CompanyStudent;
import com.oops.Sample.PayingStudent;
import com.oops.Sample.ArrayStudent;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<>();
		student.add("Raj");
		student.add("Ram");
		student.add("Rahul");
		System.out.println("ArrayList = "+student);
		System.out.println("Get element ="+student.get(1));
		student.set(2,"Raja");
		student.remove(2);
		System.out.println(student);

	}

}
