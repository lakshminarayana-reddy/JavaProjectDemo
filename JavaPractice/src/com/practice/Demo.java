package com.practice;

public class Demo {
	//test updated
	public static void main(String[] args) {
		String demo ="Sai";
		String demo1="Sai";
		if(demo.equals(demo1)) {
			System.out.println(demo.toString());
			System.out.println(demo1.toString());
		}
		if(demo==demo1) {
			System.out.println(demo);
			System.out.println(demo1);
		}
		String s ="abc-123";
		String arr[]=s.split("-");
		for(String ar:arr) {
			System.out.println(ar);
		}
		String s1 = "17.98";
		float f = Float.parseFloat(s1);
		System.out.println(f);
	}

}
