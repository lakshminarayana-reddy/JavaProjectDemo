package com.regularexpressions;

import java.util.regex.Pattern;

public class SplitUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\s");
		String arr[] = p.split("My Name is Charan");
		for(String s:arr) {
			System.out.println(s);
		}
		
		Pattern p1 = Pattern.compile("\\."); // or use [.] instead of \\.
		String arr1[] = p1.split("My.Name.is.Charan");
		for(String s1:arr1) {
			System.out.println(s1);
		}


	}

}
