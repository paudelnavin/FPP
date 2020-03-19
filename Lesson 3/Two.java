package com.grade.wednesday;

import java.util.Scanner;

public class Two {
	
	public static void main(String[] args) {
		char converted_char;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		StringBuffer appendWord = new StringBuffer(sc.nextLine());
		//StringBuffer appendWord = word.append(" Bye");
		//System.out.println(appendWord);
		//System.out.println('a'-'A');
		String newWord="";
		for(int i=0; i<appendWord.length(); i++) {
			char one = appendWord.charAt(i);
			//System.out.println(one);
			if((one>='a')&&(one<='z')) {
				converted_char = (char) (one-32);
				System.out.println(converted_char);
			}
			else if ((one>='A')&&(one<='Z')) {
				converted_char = (char) (one+32);
				System.out.println(converted_char);
			}
		}
		System.out.println(newWord);
		
	}

}
