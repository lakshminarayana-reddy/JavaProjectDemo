package com.regularexpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndWriteInFiles {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir")+"\\Downloads\\output.txt");
		PrintWriter pw = new PrintWriter(System.getProperty("user.dir")+"\\Downloads\\output.txt"); //Output file
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z]+([.][a-zA-z]+)+");
		BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\Downloads\\Input.txt")); //input file
		String line = br.readLine();
		while(line!=null) {
			Matcher m =p.matcher(line);
			if(m.find()) {
				pw.println(m.group());
			}
			line=br.readLine();
		}
		pw.flush();
	}

}
