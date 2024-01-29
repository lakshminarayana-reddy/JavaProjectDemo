package com.stringprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class StringComparisions {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest =s.substring(0,k);
		String largest =s.substring(0,k);
		String sub;
		for(int i=0; i<s.length()-(k-1); i++){
			sub =s.substring(i,k+i);
			//System.out.println(sub);
			System.out.println(sub.compareTo(smallest));
			if(sub.charAt(0)<smallest.charAt(0)){
				smallest=sub;
			}else if(sub.charAt(0)>largest.charAt(0)) {
				largest=sub;
			}
		}
		return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int k = scan.nextInt();
		//scan.close();
		String s1="abcdef";
		String s2 ="abcd";
		System.out.println(s1.compareTo(s2));
		//getSmallestAndLargest(s,k);
		//System.out.println(getSmallestAndLargest(s, k));
	}
}