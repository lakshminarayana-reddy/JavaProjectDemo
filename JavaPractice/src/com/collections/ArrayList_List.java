package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_List {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<>();
		ar.add("Sai");
		ar.add(17);	
		ar.add(null);
		System.out.println(ar);
		ar.add("Charan");
		System.out.println(ar);
		ArrayList<Object> ar1 = new ArrayList<>();
		ar1.add("Sai");
		ar1.add(17);
		ar.addAll(1,ar1);
		System.out.println(ar);
//		for(Object obj : ar) {
//			System.out.println(obj);
//		}
		Iterator<Object> iterate = ar.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		ListIterator<Object> listIterate = ar.listIterator();
		while(listIterate.hasNext()) {
			System.out.println(listIterate.next());
		}
		while(listIterate.hasPrevious()) {
			System.out.println(listIterate.previous());
		}
//		Collections.sort(ar);;
//		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}

}
