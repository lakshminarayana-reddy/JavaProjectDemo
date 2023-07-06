package com.collections;

import java.util.TreeSet;

public class TreeSet_Set {
	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<>();
		set.add("Sai");
		set.add("Charan");
//		set.add(17);
//		set.add(31f);
//		set.add('k');
		set.add("KLNR");
		set.add("Charan");
		set.pollFirst();
		set.pollLast();
		System.out.println(set);
	}
}
