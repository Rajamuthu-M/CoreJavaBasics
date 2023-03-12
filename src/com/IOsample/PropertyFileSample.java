package com.IOsample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileSample {

	public static void main(String[] args) throws IOException {
		Properties connProp = new Properties();
		connProp.setProperty("Username","122sw");
		connProp.setProperty("Password","12uhi");
		FileOutputStream propsFile = new FileOutputStream("Information.Properties");
		connProp.store(propsFile, "Properties File");
		propsFile.close();
		
		String userName = null;
		String password = null;
		Properties tempProp = new Properties();
		FileInputStream obtained = new FileInputStream("Information.Properties");
		tempProp.load(obtained);
		propsFile.close();
		
		userName = tempProp.getProperty("username");
		password = tempProp.getProperty("password");
		System.out.println(userName + password);
		
		

	}

}
