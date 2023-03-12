/*
 * The switch statement is a multiway branch statement. 
 * It provides an easy way to dispatch execution to different parts of code based on the value of the expression.
 * The expression can be of type byte, short, int char, or an enumeration.
 * Duplicate case values are not allowed.The default statement is optional.
 * Jump statements -> break    - Terminate a sequence
 * 					  continue - continue to running the loop but stop processing the remainder of the code in its body for this particular iteration.
 * 					  return   - The return statement is used to explicitly return from a method.
 */
package com.ctlloopSamples;

public class SwitchStatement {

	public static void main(String[] args) {
		int month = 2;
		int year = 2001;
		int numDays =0;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				numDays = 31;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
		case 2:
				if(((year%4==0)&&(year%100==0))||(year%400==0))
					numDays = 29;
				else
					numDays = 28;
				break;
		}
		System.out.println("Number of Days = "+numDays);

	}

}
