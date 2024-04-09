package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		/*
		 * a - exactly one a
		 * a+ - At least one a
		 * a* - Any number of a's including zero
		 * a? - Atmost one a (one or zero)
		 */
		// In regular expressions it will consider last index +1 also for eg: if we have 8 characters it will check for 9th one also
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	}

}
