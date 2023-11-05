package com.practice;

public class TwoDArray {

	public static void main(String[] args) {
		storeData();
	}
	public static Object[][] storeData(){
		Object data[][] = new Object[3][4];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				data[i][j]=i+j;
				System.out.print(i+"**"+j+"="+data[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println(data[1][4]);
		return data;
	}

}
