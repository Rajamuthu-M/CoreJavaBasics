package com.IOsample;

import java.io.FileReader;

public class FileReaderSample {

	public static void main(String[] args) {
		char[] array = new char[100];
		try {
			FileReader input = new FileReader("input12.txt");
			
			//Read Characters
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			//close the reader
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
