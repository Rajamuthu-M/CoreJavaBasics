package com.IOsample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
	private static void process(String str) { 
		System.out.println("Processing....>"+str+"\n");
	}
	private static void doReadFromStdin() {
		try {
			BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
			String inLine="";
			
			while(!(inLine.equalsIgnoreCase("quit"))&&!(inLine.equalsIgnoreCase("exit"))) {
				System.out.println("prompt");
				inLine=inStream.readLine();
				process(inLine);
				
			}
		}
		catch(IOException e) {
			System.out.println("IOException"+e);
		}
	}

}
