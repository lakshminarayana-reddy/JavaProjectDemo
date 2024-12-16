package com.practice;

import java.util.Arrays;
import java.util.List;

public class ExcelRead {

	public static void main(String[] args) {
		String s ="P1,P2,P3,P4,P5";
		List<String> list =Arrays.asList(s.toUpperCase().split(","));
		System.out.println(list.contains("P1"));
		System.out.println(list);
	}

}
