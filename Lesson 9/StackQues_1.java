package Lesson_9;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackQues_1 {
	
	private Node top;
	private int length;
	
	private class Node{
		private Node next;
		private int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public StackQues_1() {
		top=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		newNode.next=top;
		top=newNode;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int temp = top.data;
		top=top.next;
		length--;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
//	public void display() {
//		if(isEmpty()) {
//			throw new EmptyStackException();
//		}
//		
//        Node temp = top; 
//        while (temp != null)  
//        { 
//            System.out.print(temp.data + "---> "); 
//            temp = temp.next; 
//        } 
//        
//        System.out.println(temp);  //here temp will be null
//	}
	
	public void display() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
        Node temp = top; 
        System.out.print("The integers reversed are: ");
        while (temp != null)  
        { 
            if(temp.next==null) {
            	System.out.print("and "+temp.data+"."); 
                temp = temp.next;
            }else {
            	System.out.print(temp.data + ", "); 
                temp = temp.next;	
            }
        	 
        } 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Some positive integers to make a stack and negative number to exit: ");
		StackQues_1 stack = new StackQues_1();
		
		int number  = sc.nextInt();
		while(number >=0) {
			stack.push(number);
			number = sc.nextInt();
		}
		
		stack.display();
//		System.out.println("\nPeek value is "+stack.peek());
//		
//		
//		stack.pop();
//		System.out.println("Peek value is "+stack.peek());
//		stack.display();
	}
	
	
}
