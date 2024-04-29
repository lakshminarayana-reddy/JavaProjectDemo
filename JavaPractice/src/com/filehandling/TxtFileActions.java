package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TxtFileActions {
	static String filePath="C:\\MyFiles\\MyFile.txt";
	static String newPath="C:\\MyFiles\\MyFileRenamed.txt";

	//Create File
	public static void createFile(String filePath){
		File file = new File(filePath);
		try {
			if(file.createNewFile()) {
				System.out.println("File created:"+ file.getName());
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//To write data into file
	public static void writeDataToFile(String filePath) {
		try {
			FileWriter writer = new FileWriter(filePath, true);
			writer.write("\n");
			writer.write("Welcome to Java file handling");
			writer.close();
			System.out.println("Successfully written in file");
		} catch (IOException e) {
			System.out.println("An error occured while writing data to the file");
			e.printStackTrace();
		}
	}
	
	//To read the data from the file
	public static void readDataFromTheFile(String filePath) {
		File file = new File(filePath);
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//To rename the file
	public static void renameFile(String oldPath, String newPath) {
		File oldFile = new File(oldPath);
		File newFile = new File(newPath);
		if(oldFile.renameTo(newFile)) {
			System.out.println("File renamed successfully..!");
		}else {
			System.out.println("Rename is not successful..!");
		}
	}
	
	//To delete the file
	public static void deleteFile(String filePath) {
		File file = new File(filePath);
		if(file.delete()) {
			System.out.println("File deleted successfully "+file.getName());
		}else {
			System.out.println("File deletion is unsuccessful");
		}
	}
	public static void main(String[] args) {
		//createFile(filePath);
		//writeDataToFile(filePath);
		//readDataFromTheFile(filePath);
		renameFile(filePath, newPath);
		deleteFile(newPath);
	}

}
