package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_List {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(null);
		String[] s1 = new String[1];
		s1[0]="";
		System.out.println(s1[0]);
		System.out.println(s);
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
		//Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		arrayListTwo();
	}
	public static void arrayListTwo() {
		ArrayList<ArrayList<Object>> arlst = new ArrayList<ArrayList<Object>>();
		ArrayList arlst1 = new ArrayList();
		arlst1.add("Username");
		arlst1.add("Password");
		ArrayList arlst2 = new ArrayList();
		arlst2.add("Sai");
		arlst2.add("reddy");
		arlst.addAll(arlst1);
		arlst.addAll(arlst2);
		Iterator iterate = arlst.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}
