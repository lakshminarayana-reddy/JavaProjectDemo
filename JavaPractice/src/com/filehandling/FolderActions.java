package com.filehandling;

import java.io.File;

public class FolderActions {
	static String folderPath="C:\\MyFiles";
	static String newPath="C:\\MyFilesRenamed";
	
	//Create a folder
	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created successfully"+folderPath);
		}
	}
	
	//To Check folder exists
	public static boolean isFolderPresent(String folderPath) {
		File folder = new File(folderPath);
		return folder.exists();
	}
	
	//To rename the folder
	public static void renameFolder(String folderPath, String newPath) {
		File oldFolder = new File(folderPath);
		File newFolder = new File(newPath);
		if(oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder renamed to :"+newPath);
		}
	}
	
	//To delete a folder
	public static void deleteFolder(String folderPath) {
		File folder = new File(folderPath);
		if(folder.exists()) {
			for(File file:folder.listFiles()) {
				file.delete();
			}
			folder.delete();
			System.out.println("Folder deleted successfully");
		}
	}

	public static void main(String[] args) {
		createFolder(folderPath);
		System.out.println(isFolderPresent(folderPath));
		renameFolder(folderPath,newPath);
		deleteFolder(newPath);
	}

}
