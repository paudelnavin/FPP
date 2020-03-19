package com.grade.wednesday;

import java.util.Scanner;

public class One {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check a palindrome: ");
		String word = sc.nextLine();
		String check="";
		for(int i=word.length()-1; i>=0; i--) {
			check=check+word.charAt(i);
		}
		if(word.equals(check))
			System.out.println("Given word is a palindrome");
		else
			System.out.println("Given word is not a palindrome");	
	}
}

