package com.practice;

public class TwoDArray {

	public static void main(String[] args) {
		
	}
	public static Object[][] storeData(){
		Object data[][] = new Object[2][2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				data[i][j]=i+j;
				System.out.println(data[i][j]);
			}
		}
		return data;
	}

}
