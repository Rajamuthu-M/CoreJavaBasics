package com.ctlloopSamples;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		int n1 = 0,a;
		int n2 = 1;
		Scanner input = new Scanner(System.in);
		int c =input.nextInt();
		System.out.println("0");
		System.out.println("1");
		for(int i = 0; i < c-2;i++) {
			a = n1+n2;
			n1=n2;
			n2=a;
			System.out.println(a);
		}
		input.close();
	}
}
