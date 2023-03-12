package com.ctlloopSamples;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] numbers = {2,45,4,56,45,3};
		System.out.println(numbers.length);
		int sum = 0;
		for(int number : numbers) {
			sum+=number;
		}
		System.out.println("Sum = "+sum);
	}
}
