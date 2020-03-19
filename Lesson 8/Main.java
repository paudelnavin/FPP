package Lesson_8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static LinkedList<Character> nameA = new LinkedList<Character>();
	static LinkedList<Character> nameB = new LinkedList<Character>();
	static LinkedList<Character> nameC = new LinkedList<Character>();
	
	
	public static void main(String[] args) {
		
		caseFunction();
		
	}
	
	private static void caseFunction() {
		System.out.print("\n");
		System.out.println("Enter Command (Choose R/W/L/C/E/Q): ");
		String string = sc.nextLine();;
         switch(string.toUpperCase()){
        	 case "R":
        		readString();
        		break;
        	 
        	 case "W":
         		writeString();
         		break;	
             
        	 case "C":
         		clearOwn();
         		break;
         	
        	 case "L":
          		lengths();
          		break;
          	
        	 case "E":
        		 	System.out.println("Which two string you want to compare (A or B)/(A or C)/(B or C)): ");
        			System.out.println("Enter first string A/B/C");
        			String firstString = sc.nextLine();
        			System.out.println("Enter second string A/B/C");
        			String secondString = sc.nextLine();
           		    if(firstString.equalsIgnoreCase("A") && secondString.equalsIgnoreCase("B")) {
           		    	equallist(nameA, nameB);
           		    }
           		    if(firstString.equalsIgnoreCase("A") && secondString.equalsIgnoreCase("B")) {
        		    	equallist(nameA, nameC);
        		    }
           		    if(firstString.equalsIgnoreCase("A") && secondString.equalsIgnoreCase("B")) {
           		    	equallist(nameB, nameC);
           		    }
        			
           		break;
          		
        	 case "Q":
        		 System.out.println("Thank you for your visit.");
          		 System.exit(0);
          		 break;
          		
        	 default: 
            	 System.out.println("Invalid command. Please don't be stupid. Enter appropriate command");
        	     caseFunction();
            	 break;
         }
		
	}
			
	static void readString() {
		
		System.out.println("Enter a string (A/B/C): ");
		
		String string = sc.nextLine();
		if (string.equalsIgnoreCase("A")) {
			System.out.println("Enter text: ");
			String text = sc.nextLine();
			for (int i = 0; i < text.length(); i++) {
				nameA.add(text.charAt(i));
		    }
			System.out.println("Saved successfully");
		}
		if (string.equalsIgnoreCase("B")) {
			System.out.println("Enter text: ");
			String text = sc.nextLine();
			for (int i = 0; i < text.length(); i++) {
				nameB.add(text.charAt(i));
		    }
			System.out.println("Saved successfully");
		}
		if (string.equalsIgnoreCase("C")) {
			System.out.println("Enter text: ");
			String text = sc.nextLine();
			for (int i = 0; i < text.length(); i++) {
				nameC.add(text.charAt(i));
		    }
			System.out.println("Saved successfully");
		}
		if (!((string.equalsIgnoreCase("A"))||(string.equalsIgnoreCase("B"))||(string.equalsIgnoreCase("C")))) {
		
			System.out.println("Please enter an appropriate command. Choose again");
			readString();
		}
		
		System.out.println("Do you want to read more (Y/N): ");
		string = sc.nextLine();
		if (string.equalsIgnoreCase("Y")) {
			readString();
		} else {
			System.out.println("Terminated");
			caseFunction();
		}
	}
	
	static void writeString() {
		System.out.println("Please enter a string which you want to show (A/B/C): ");
		
		String string = sc.nextLine();
		if (string.equalsIgnoreCase("A")) {
			System.out.println("String written in character A is -->");
			for(int i=0; i<nameA.size();i++) {
				char A = nameA.get(i);
				System.out.print(A);
				
			}
		}
		if (string.equalsIgnoreCase("B")) {
			System.out.println("String written in character B is -->");
			for(int i=0; i<nameB.size();i++) {
				char B = nameB.get(i);
				System.out.print(B);
				
			}
		}
		if (string.equalsIgnoreCase("C")) {
			System.out.println("String written in character C is -->");
			for(int i=0; i<nameC.size();i++) {
				char C = nameC.get(i);
				System.out.print(C);
				
			}
		}
		if (!((string.equalsIgnoreCase("A"))||(string.equalsIgnoreCase("B"))||(string.equalsIgnoreCase("C")))) {
			
			System.out.println("Please enter an appropriate command. Choose again");
			writeString();
		}
		System.out.println("Do you want to write string (Y/N): ");
		string = sc.nextLine();
		if (string.equalsIgnoreCase("Y")) {
			writeString();
		} else {
			System.out.println("Terminated");
			caseFunction();
		}
	}
	
	static void clearOwn() {
		
		System.out.println("Enter which string you want to clear (A/B/C): ");
		
		String string = sc.nextLine();
		if (string.equalsIgnoreCase("A")) {		
			nameA.clear();
			System.out.println("Cleared successfully");
		}
		if (string.equalsIgnoreCase("B")) {		
			nameB.clear();
			System.out.println("Cleared successfully");
		}
		if (string.equalsIgnoreCase("C")) {		
			nameC.clear();
			System.out.println("Cleared successfully");
		}
		if (!((string.equalsIgnoreCase("A"))||(string.equalsIgnoreCase("B"))||(string.equalsIgnoreCase("C")))) {
			
			System.out.println("Please enter an appropriate command. Choose again");
			clearOwn();
		}
		System.out.println("Do you want to clear string (Y/N): ");
		string = sc.nextLine();
		if (string.equalsIgnoreCase("Y")) {
			clearOwn();
		} else {
			System.out.println("Terminated");
			caseFunction();
		}
	}
	
	static void lengths() {
		System.out.println("Enter which string you want to find length (A/B/C): ");
		
		String string = sc.nextLine();
		if (string.equalsIgnoreCase("A")) {		
			int count=0;
	        Iterator<Character> iterator = nameA.iterator(); 
	      
	        while (iterator.hasNext()) {
	            iterator.next();
	        	count++; 
	        } 
			System.out.println("Length of String A is: "+count);
		}
		if (string.equalsIgnoreCase("B")) {		
			int count=0;
	        Iterator<Character> iterator = nameB.iterator(); 
	      
	        while (iterator.hasNext()) {
	            iterator.next();
	        	count++; 
	        } 
			System.out.println("Length of String A is: "+count);
		}
		if (string.equalsIgnoreCase("C")) {		
			int count=0;
			Iterator<Character> iterator = nameC.iterator(); 
  
			while (iterator.hasNext()) {
				iterator.next();
				count++; 
			} 
			System.out.println("Length of String A is: "+count);
		}
		if (!((string.equalsIgnoreCase("A"))||(string.equalsIgnoreCase("B"))||(string.equalsIgnoreCase("C")))) {
			
			System.out.println("Please enter an appropriate command. Choose again");
			lengths();
		}
		System.out.println("Do you want to check length of string (Y/N): ");
		string = sc.nextLine();
		if (string.equalsIgnoreCase("Y")) {
			lengths();
		} else {
			System.out.println("Terminated");
			caseFunction();
		}
	}
	
	static void equallist(LinkedList<Character> l1, LinkedList<Character> l2 ) {
		int isEqual=0;
		char ch1, ch2;
		
		if(l1==null && l2==null) isEqual=1;
		if(l1==null || l2==null) isEqual=0;
		if(l1.size() != l2.size()) isEqual=0;
		
		Iterator<Character> it1 = l1.iterator();
		Iterator<Character> it2 = l2.iterator();
		while(it1.hasNext()) {
		   ch1=it1.next();
		   ch2=it1.next();
		   if(ch1!=ch2)
			   isEqual=0;
		}
		if(isEqual==1)
			System.out.println("Two String are equal");
		else
			System.out.println("Two string are not equal");
	
			caseFunction();		
	}
}
