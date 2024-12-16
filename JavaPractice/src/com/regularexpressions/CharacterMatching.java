package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Character classes
		 * [abc] - either a or b or c
		 * [^abc] -Except a and b and c
		 * [a-z] - Any lower case alphabet symbol
		 * [A-Z] - Any upper case alphabet symbol
		 * [a-zA-Z] - Any alphabet symbol
		 * [0-9] -Any numeric symbol
		 * [0-9a-zA-Z] - Any alphanumeric symbol
		 * [^0-9a-zA-Z] - Except alphanumeric symbol
		 */
		/* String arr[] = {"[abc]","[^abc]","[a-z]","[A-Z]","[a-zA-Z]","[0-9]","[0-9a-zA-Z]","[^0-9a-zA-Z]"};
		 for(String s:arr) {
			 Pattern p =Pattern.compile(s);
			 Matcher m = p.matcher("abcdw8724*!))#");
			 while(m.find()) {
				 System.out.println(m.start()+" "+m.group());
			 }
			 System.out.println("Next string");
		 }*/
		
		/*Pre defined character classes
		 * \s - space character
		 * \S - Except space character
		 * \d - Any digit from 0-9
		 * \D - Except digits
		 * \w - Any word character [0-9a-zA-Z]
		 * \W - Except word character i.e. any special character
		 * . - Any character
		 */
		 String arrChar[] = {"\\s","\\S","\\d","\\D","\\w","\\W","."};
			 Pattern p1 =Pattern.compile(".");
			 Matcher m1 = p1.matcher("abcd w87 24*!))#");
			 while(m1.find()) {
				 System.out.println(m1.start()+" "+m1.group());
			 }
			 System.out.println("Next char");

	}

}
