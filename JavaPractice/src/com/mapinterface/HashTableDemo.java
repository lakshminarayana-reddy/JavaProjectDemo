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
	}

}
