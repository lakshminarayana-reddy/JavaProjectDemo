package com.practice;

import java.util.Hashtable;

public class TwoDArray {
	static Hashtable<String, String> table=null;

	public static void main(String[] args) {
		storeData();
		Hashtable<String,String> data2=table;
		System.out.println(data2.get("1A"));
	}
	public static Object[][] storeData(){
		Object data[][] = new Object[2][2];
		
		for(int i=0; i<2; i++) {
			table=new Hashtable<String,String>();
			for(int j=0; j<2; j++) {
				table.put(String.valueOf(i)+"A",String.valueOf(j));
				System.out.println(table);
				data[i][j]=table;
				//System.out.println(data);
			}
		}
		//System.out.println(data);
		return data;
	}
}
