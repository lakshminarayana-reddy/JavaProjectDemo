package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		String sub ="ab";
		String full ="ababbbab";
		Pattern p = Pattern.compile(sub);
		Matcher m = p.matcher(full);
		while(m.find()) {
			System.out.println(m.start()+" "+(m.end()-1)+" "+m.group());
		}
	}

}


