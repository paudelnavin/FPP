package wednesdaylab;

import java.util.Scanner;

public class LabLevel2_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		checkPalindrome();
	}

	private static void checkPalindrome() {
		System.out.println("Enter a string for palindrome check: ");
		String string = sc.nextLine();
		String checkString = string.toLowerCase().replaceAll("\\p{Punct}", "");
		check(checkString);
	}
	
	public static void check(String s) {
		
		String withoutBlank = removeBlanks(s);
		String revString = reverseString(withoutBlank);
         
		if(withoutBlank.equals(revString))
			System.out.println("Input sentence is palindrome");
		else
			System.out.println("Input sentence is not a palindrome");
	}

	private static String removeBlanks(String s) {
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				newString = newString + s.charAt(i);
			}
		}
		return newString;
	}

	private static String reverseString(String s) {
		String revString = "";
		for (int i = s.length() - 1; i > -1; i--) {
			revString = revString + s.charAt(i);
		}
		return revString;
	}

}
