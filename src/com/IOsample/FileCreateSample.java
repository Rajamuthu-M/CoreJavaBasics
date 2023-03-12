package com.IOsample;

import java.io.File;

public class FileCreateSample {

	public static void main(String[] args) {
		
		//create a file object for the current location
		File dir = new File("C:\\Users\\Office\\OneDrive - zucisystems.com\\Documents");//File dir = new File("newFileDirectory.txt");
		boolean value = false;
		File files[] = dir.listFiles();//files are created as array
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());//to get file name
		}
		
		
		try {
			//trying to create a file based on the object
			boolean isDir = dir.mkdir();
			dir.getAbsolutePath();
			dir.exists();
			
			
			if(isDir) {
				File file = new File("newFile.txt");// File file = new File(dir.AbsolutePath+"newFile.txt");
				value = file.createNewFile();
			}
			if(value) {
				System.out.println("The file is Created");
			}
			else {
				System.out.println("The file already exists.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}
	} 
}
