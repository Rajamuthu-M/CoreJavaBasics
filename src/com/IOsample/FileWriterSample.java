package com.IOsample;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		String data = "This is the data in the output file";
		try {
			FileWriter output = new FileWriter("output.txt");
			
			//Writes the string to the file
			output.write(data);
			output.flush();
		
			//close the writer
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
