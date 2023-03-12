/*
 * Looping is a feature which execute a set of instructions repeatedly while some condition evaluates to true.
 * for loop(Entry Control Loop) provides a concise way of writing the loop structure.
 * initialization, condition and increment/decrement in one line
 * Flow of Execution :- Initialization condition: -> Testing Condition -> Statement execution -> Increment/ Decrement -> Loop termination.
 */
package com.ctlloopSamples;

public class ForLoop {

	public static void main(String[] args) {
		int[] arrayOfInts = {2,45,4,56,45,3};
		for(int i=0;i<arrayOfInts.length;i++) {
			System.out.println(arrayOfInts[i]);
		}
	}
}
