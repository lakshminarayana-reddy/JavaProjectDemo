package com.regularexpressions;

import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		//For String tokenizer default split is space
		StringTokenizer st = new StringTokenizer("My name is sai charan");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		//For some other char other than space
		StringTokenizer st1 = new StringTokenizer("My.name.is.sai.charan", ".");
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}
	}

}
