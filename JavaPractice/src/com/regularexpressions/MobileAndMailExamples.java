package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileAndMailExamples {

	public static void main(String[] args) {
		/*
		 * 10 digit mobile num - [789][0-9]{9} -->Flower bracket 9 means [0-9] will be repeated 9 times.
		 * 10 or 11 digit mobile num - 0?[789][0-9]{9} -->0? means either 0 can be there or not there.
		 * 10 or 11 or 12 digit mobile num - (0|91)?[789][0-9]{9}
		 */
		
		/*
		 * Email - [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+
		 * [a-zA-Z0-9_.]* -- this means that group of characters can be used n times (* indicates any number of times)
		 * [a-zA-Z0-9]+ -- atleast one time (+ indicates atleast one time)
		 * ? indicates one or none
		 */
		Scanner sc = new Scanner(System.in);
		String l = sc.next();
		Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher m = p.matcher(l);
		if(m.find() && m.group().equals(l)){
			System.out.println("Valid mobile number");
		}else {
			System.out.println("Invalid mobile number");
		}
	}

}
