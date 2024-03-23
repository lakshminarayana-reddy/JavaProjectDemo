package com.mapinterface;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Object, Object> table = new Hashtable<>();
		table.put(1707, "Sai");
		table.put(31, 'K');
		table.put(22, "Sailu");
		//table.put(null, null);
		System.out.println(table);
		data();
	}
	public static Object[][] data(){
		Object data[][] = new Object[1][1];
		Hashtable<Object, Object> table= null;
		for(int i=0; i<=1; i++) {
			table = new Hashtable<Object, Object>();
			for(int j=0; j<=1; j++) {
				table.put(i, j);
				data[i][0]=table;
				//System.out.println(data[i][0]);
				System.out.println(table);
			}
		}
		//System.out.println(table);
		return data;
	}
	public static void test(Hashtable<String,String> data) {
		System.out.println(data);
	}
}
