/*
 * if statement accepts boolean values
 * If curly braces isn't provided after if condition then then the immediate statement is considered for execution
 * So upcoming lines will always executed
 * A nested if is an if statement that is the target of another if or else.
 * if-else-if ladder:- There can be as many as ‘else if’ blocks associated with one ‘if’ block but only one ‘else’ block is allowed with one ‘if’ block.
 */
package com.ctlloopSamples;

public class IfElseStatements {
	public static void main(String args[]) {
		IfElseStatements exe = new IfElseStatements();
		int testscore = 76;
		char grade;
		if(testscore >= 90) {
			grade = 'A';
		}
		else if(testscore >= 80) {
			grade = 'B';
		}
		else if(testscore >= 70) {
			grade = 'C';
		}
		else if(testscore >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Grade = "+grade);
		exe.example1();
		exe.example2();
	}
	
	public void example1() {
		int aNumber = 3;
		System.out.println("Example 1");
		if(aNumber>=0) {
			if(aNumber==0) {
				System.out.println("First string");
			}
			//if nested if is  false then control search that nested if's, else statement. if its not available then comes out of if-else.
		}
		else {
			System.out.println("Second string");
		}
		System.out.println("Third string");
	}
	public void example2() {
		int aNumber = 3;
		System.out.println("Example 2");
		if(aNumber>=0)
			if(aNumber==0)
				System.out.println("First string");
		else 
			System.out.println("Second string");
		System.out.println("Third string");
	}
}
