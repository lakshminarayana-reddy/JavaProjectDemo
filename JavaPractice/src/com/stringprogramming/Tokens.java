package com.stringprogramming;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String ch[] ={"!","?",".",",","_","@","\'"};
		boolean status = false;
		for(char ch1='A'; ch1<='Z';ch1++) {
			if((s.toUpperCase()).contains(String.valueOf(ch1))) {
				status=true;
				break;
			}
		}
		if(status){
			String a =s;
			for(int i=0; i<ch.length;i++){
				if(a.contains(ch[i])){
					a=a.replace(ch[i]," ");
				}
			}
			a=a.replaceAll("\\s{2,}", " ");
			a=a.trim();
			String c[]= a.split(" ");
			System.out.println(c.length);
			for(int j=0; j<c.length; j++){
				System.out.println(c[j]);
			}
		}else {
			System.out.println(0);
		}
		scan.close();
	}

}
