package Lesson_9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuesLab2{

	static Queue<Character> queue1 = new LinkedList<>();
	static Queue<Character> queue2 = new LinkedList<>();
	boolean isColonFound = false;
	static QueuesLab2 main;

	public static void main(String args[]) {
		main = new QueuesLab2();
		 main.data();
	}

	private void data() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string");
		String string = s.next();
		char data;

		for (int i = 0; i < string.length(); i++) {
			
			data = string.charAt(i);
     
			if (isColonFound == false) {
				if (data != ':')
					queue1.add(data);
				else
					isColonFound = true;
			} else
				queue2.add(data);
		}

		System.out.println("queue1 is " + queue1);
		System.out.println("and queue2 is " + queue2);
		main.check();
		
		s.close();

	}

	private void check() {
		if (isColonFound == false) {
			System.out.println("N: No colon on the line");
		} 
		if (queue1.size() < queue2.size()) {
			System.out.println("R: The right part (after the colon) is longer than the left");

		}
		if (queue1.size() > queue2.size()) {
			System.out.println("L: The left part (before the colon) is longer than the right");

		}
		if (queue1.size() == queue2.size() && !(queue1.equals(queue2))) {
			System.out.println("D: The left and right parts have the same length but are different");

		}
		if (queue1.equals(queue2)) {
			System.out.println("S: The left and right parts are exactly the same");
		}

	}
}
