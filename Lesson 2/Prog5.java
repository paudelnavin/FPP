package lab;

import java.util.Scanner;

public class Prog5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any text for reverse order: ");
		String text = sc.nextLine();
		//System.out.println(text.length());
		for(int i=text.length()-1; i>=0; --i) {
			System.out.print(text.charAt(i));
			
		}
		
		System.out.println("\nEnter a sentence to find number of 'X': ");
		String sentence = sc.nextLine();
		int sum = 0;
		for(int i=sentence.length()-1; i>=0; --i) {
			if(sentence.charAt(i)== 'x' || sentence.charAt(i)== 'X') {
				sum = sum +1;
			}		
		}
		
		System.out.println("Number of X are: " + sum );
	
		sc.close();
	}	

}
