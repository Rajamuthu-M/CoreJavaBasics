/*
 * Nested loop means a loop statement inside another loop statement.
 * Nested for loop, Nested while loop, Nested do while loop, Nested while and for loop 
 */
package com.ctlloopSamples;

public class NestedLoopSample {

	public static void main(String[] args) {
		//Nested do while loop
		int row = 1, column = 1;
        int x;
        do {
            x = 4;
            do {
                System.out.print("");
                x--;
            } while (x >= row);
            column = 1;
            do {
                System.out.print(column + " ");
                column++;
 
            } while (column <= 5);
            System.out.println(" ");
            row++;
        } while (row <= 5);
        
        //Nested while and for loop
        int weeks = 3;
        int days = 7;
        int i = 1;
 
        // outer loop
        while (i <= weeks) {
            System.out.println("Week: " + i);
 
            // inner loop
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Days: " + j);
            }
            ++i;
        }
    }
}
