package com.collections;

import java.util.PriorityQueue;

public class PriorityQueue_Queue {

	public static void main(String[] args) {
		PriorityQueue<Object> q = new PriorityQueue<>();
		q.add("Sai");
		q.add("Sai");
		//q.add(null); - It throws null pointer exception
		//q.add(17); - It allows only homogeneous data
		//q.add('K');
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.add("Selenium");
		q.add("Java");
		q.add("TestNG");
		q.add("GitHub");
		System.out.println("Before polling"+q);
		while(q.peek()!=null)
			System.out.println(q.poll());
		System.out.println("After polling"+q);
	}

}
