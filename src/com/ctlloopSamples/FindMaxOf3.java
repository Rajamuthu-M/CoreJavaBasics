package com.ctlloopSamples;

import java.util.Scanner;

public class FindMaxOf3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a =input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("a is bigger");
		}
		else if(b>c) {
			System.out.println("b is bigger");
		}
		else {
			System.out.println("c is bigger");
		}
		input.close();
	}
}
