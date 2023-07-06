package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Set {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add("Sai");
		set.add(17);
		set.add("Charan");
		set.add(17);
		set.add("Sai");
		set.add('K');
		set.add(31f);
		System.out.println(set);
		Iterator<Object> iterate =set.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
	}

}
