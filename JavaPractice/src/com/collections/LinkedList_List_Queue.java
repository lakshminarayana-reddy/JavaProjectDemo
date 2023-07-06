package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_List_Queue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(17);
		q.add(22);
		q.add(31);
		q.add(10);
		System.out.println(q);
		System.out.println(q.peek());
		while(q.peek()!=null)
			System.out.println(q.poll());
		System.out.println("After Polling"+q);
		
		LinkedList<Object> list = new LinkedList<>();
		list.add("Sai");
		list.add(17);
		list.add("Charan");
		list.add('K');
		list.add(null);
		list.add("Sai");
		System.out.println(list);
		Collections.reverse(list);
		Iterator<Object> iterate = list.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
		while(list.peek()!=null)
			System.out.println(list.poll());
	}

}
