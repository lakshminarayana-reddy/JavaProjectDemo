package com.practice;

import java.io.File;

public class VerifyDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"//Downloads";
		File file = new File(path);
		File[] fileArr = file.listFiles();
		for(int i=0; i<fileArr.length; i++) {
			boolean flag = false;
			if(fileArr[i].getName().contains("hbdkb")) {
				System.out.println("File downloaded");
				flag=true;
			}else {
				System.out.println("File not downloaded");
			}
		}
	}

}
