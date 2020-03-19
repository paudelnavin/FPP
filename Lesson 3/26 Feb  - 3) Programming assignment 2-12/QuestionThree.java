package Assignment;

import java.util.Scanner;

public class QuestionThree {
	
	public static void main(String[] args) {
		
		char converted_char;
		String new_sentence ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		StringBuffer sentence = new StringBuffer(sc.nextLine());
		
		System.out.println("Sentence without change is: ");
		for(int i=0; i<sentence.length(); i++) {
			System.out.print(sentence.charAt(i));
		}
		
		System.out.println("Sentence with change is: ");
		for(int i=0; i<sentence.length(); i++) {
			
			char out = sentence.charAt(i);
			if(out >= 'a' && out <= 'z') {
				converted_char = (char) (out-32);
				new_sentence += converted_char;
			}else if(out >= 'A' && out <= 'Z') {
				converted_char = (char) (out+32);
				new_sentence += converted_char;
			}
			else if(out == ' ') {
				converted_char = ' ';
				new_sentence += converted_char;
			}
			
		}
		
		System.out.println(new_sentence);
	
		sc.close();
	}

}
