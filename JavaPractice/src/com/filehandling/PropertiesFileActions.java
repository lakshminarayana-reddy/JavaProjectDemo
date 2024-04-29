package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileActions {
	static Properties prop = new Properties();
	static String filePath = System.getProperty("user.dir")+"//Resources//Example.properties";
	
	//To write data to the properties file
	public static void writeToPropFile(String filePath) throws IOException {
		prop.setProperty("Name","Sai");
		prop.setProperty("Age", "25");
		prop.setProperty("Designation", "QE");
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			prop.store(fos, "Added Data to the file");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	//To read the data from the properties file
	public static void readFromPropFile(String filePath) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
			fis.close();
			String name =prop.getProperty("Name");
			System.out.println(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Set<Object> keys =prop.keySet();
		System.out.println(keys);
		Set<String> keys1 =prop.stringPropertyNames();
		System.out.println(keys1);
		Collection<Object> values =prop.values();
		System.out.println(values);
		
	}
	public static void main(String[] args) throws IOException {
		//writeToPropFile(filePath);
		readFromPropFile(filePath);
	}

}
