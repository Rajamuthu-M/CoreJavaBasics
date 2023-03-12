/*
 * A while loop ( Entry control loop) is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
 * 
 */
package com.ctlloopSamples;

import java.util.Scanner;

public class WhileLoopSample {
	public static void main(String args[]) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		while(number>=0) {
			sum+=number;
			System.out.println("Enter a number");
			number = input.nextInt();
			
		}
		System.out.println("Sum= "+sum);
		input.close();
		}

}
