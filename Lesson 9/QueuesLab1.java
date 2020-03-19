package Lesson_9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class QueuesLab1 {
	LinkedList<Character> stack1 = new LinkedList<>();
	LinkedList<Character> tempStack = new LinkedList<>();
	LinkedList<Character> queue1 = new LinkedList<>();

	LinkedList<Character> queue2 = new LinkedList<>();
	LinkedList<Character> tempStack2 = new LinkedList<>();
	LinkedList<Character> stack2 = new LinkedList<>();

	LinkedList<Character> stack3 = new LinkedList<>();
	LinkedList<Character> stack4 = new LinkedList<>();

	public static void main(String[] args) {
		QueuesLab1 main = new QueuesLab1();
		main.scanData();

	}

	public void scanData() {
		System.out.print("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		stackToQueue(data);
		queuetoStack(data);
		stackIntoOtherStack(data);
		
		s.close();
	}

	public void stackToQueue(String data) {
		for (int i = 0; i < data.length(); i++) {
			stack1.push(data.charAt(i));
		}

		Iterator<Character> it = stack1.iterator();
		while (it.hasNext()) {
			tempStack.push(it.next());
		}

		Iterator<Character> it1 = tempStack.iterator();
		while (it1.hasNext()) {
			queue1.add(it1.next());
		}

		System.out.println("Stack to Queue " + queue1);

	}

	public void queuetoStack(String data) {

		for (int i = 0; i < data.length(); i++) {
			queue2.add(data.charAt(i));
		}

		Iterator<Character> it1 = queue2.iterator();
		while (it1.hasNext()) {
			tempStack2.push(it1.next());
		}

		Iterator<Character> it = tempStack2.iterator();
		while (it.hasNext()) {
			stack2.push(it.next());
		}

		System.out.println("Queue to stack " + stack2);
	}

	public void stackIntoOtherStack(String data) {
		for (int i = 0; i < data.length(); i++) {
			stack3.push(data.charAt(i));
		}

		Iterator<Character> it = stack3.iterator();
		while (it.hasNext()) {
			stack4.push(stack3.pop());
		}

		System.out.println("Stack to stack " + stack4);
	}

}
