package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileActions {
	
	static String filePath = System.getProperty("user.dir")+"\\Resources\\Example.csv";
	//To write the data to the CSV file
	public static void writeToCSV(String filePath) {
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.append("Name,Branch \n");
			writer.append("Sai,Mech \n");
			writer.append("Ram,Auto \n");
			writer.append("Neehar,Aero \n");
			writer.close();
			System.out.println("CSV file created at: "+filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//To read the data from the CSV file
	public static void readDataFromCSV(String filePath) throws IOException {
		//Method 1 using Scanner class
		File file = new File(filePath);
		try {
			Scanner sc = new Scanner(file);
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				System.out.print(sc.next()+" \t");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Method 2 using Java split method
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line =br.readLine()) != null) {
				String[] arr =line.split(",");
				for(String val:arr) {
					System.out.print(val+"\t");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		//writeToCSV(filePath);
		readDataFromCSV(filePath);
	}

}
