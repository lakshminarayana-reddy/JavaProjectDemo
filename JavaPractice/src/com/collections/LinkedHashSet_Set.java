package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_Set {

	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add(null);
		set.add(null);
		set.add("Sai");
		set.add("Charan");
		set.add('K');
		set.add('K');
		set.add(17f);
		set.add(31);
		System.out.println(set);
	}

}
