/*
 * do while loop is similar to while loop with only difference that it checks for condition after executing the statements.
 * Exit Control Loop - do-while loop will execute its statements atleast once before any condition is checked.
 */
package com.ctlloopSamples;

import java.util.Scanner;

public class DoWhile {
	public static void main(String args[]) {
		int sum = 0;
		int number=0;
		int TotNum;
		Scanner input = new Scanner(System.in);
		System.out.println("How many number");
		TotNum=input.nextInt();
		do {
			System.out.println("Enter a number");
			number = input.nextInt();
			sum+=number;
			TotNum--;
		}
		while(TotNum>0);
		System.out.println("Sum= "+sum);
		input.close();
	}
}
