package Lesson_8;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
		
		private Node head;
		private Node tail;
		private int length;
	
		private class Node{
			private Node next;
			private Node previous;
			private String data;
			
			Node(String data){
				this.data=data;
			}
		}
		
		DoublyLinkedList(){
			this.head = null;
			this.tail = null;
			this.length = 0;
		}
		
		public boolean isEmpty() {
			return length == 0; //head ==null 
		}
		
		public int length() {
			return length;
		}
		
		//adds to the end of the list
		public void addLast(String item) {
			
		    Node new_node = new Node(item); 
		    if(isEmpty()) {
				head=new_node;
			}else {
				tail.next = new_node;
				new_node.previous = tail;
			}
		    tail=new_node;
		    length++;
		}
		
		public void addFirst(String item) {
			
			Node new_node = new Node(item); 
			if(isEmpty()) {
				tail=new_node;
			}else {
				head.previous = new_node;
				new_node.next=head;
			}
			
			head=new_node;
			length++;
		}
		
		public void insertAtNth(int position, String item) {
			
			//create new node.
		    Node newNode = new Node(item);
		 //   newNode.next = null;

		    if (isEmpty()) {
		      //if head is null and position is not zero then exit.
		      if (position == 0) {   //node set to the head.
		    	  head = newNode;
		    	  return;
		      } else { 
		    	  return;
		      }
		    }

		    if (head != null && position == 0) {
		    	head.previous = newNode;
				newNode.next=head;
				head=newNode;
		      return;
		    }

		    Node current = head;
		    Node previous = null;

		    int i = 0;

		    while (i < position) {
		    	 
                previous = current; 
  
                current = current.next; 
		    	

		      if (current == null) {
		        break;
		      }

		       i++;
		      }
 
		    newNode.next = current; 
            previous.next = newNode; 
	            
		}
		
		public Node deleteFirst() {
			
			if (isEmpty()) {
				throw new NoSuchElementException();
			}
			
			Node temp = head;
			if(head==tail) {
				tail=null;
			}else {
				head.next.previous = null;
			}
			head=head.next;
			temp.next = null;
			length--;
			
			return temp;
				
		}
		
		public Node deleteLast() {
			
			if (isEmpty()) {
				throw new NoSuchElementException();
			}
			
			Node temp = tail;
			if(head==tail) {
				head=null;
			}else {
				tail.previous.next = null;
			}
			
			tail=tail.previous;
			temp.previous = null;
			length--;
			
			return temp;
		}
		
//		public Node deleteAtNth() {
//			
//		}
	
		public void display(DoublyLinkedList head) 
	    { 
			if(head==null) {
				return;
			}
	        Node temp = this.head; 
	        while (temp != null)  
	        { 
	            System.out.print(temp.data + "---> "); 
	            temp = temp.next; 
	        } 
	        
	        System.out.println(temp);  //here temp will be null
	    } 
		
		
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, head);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.data != null) sb.append(" " + n.data);
			toString(sb, n.next);
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addFirst("Navin");
			list.addFirst("Roshni");
			list.addFirst("Sapkota");
			list.addFirst("Punturi");
			list.insertAtNth(4, "Paudel");
			list.display(list);
			
			list.deleteFirst();
			list.display(list);
			
			list.deleteLast();
			list.display(list);
		}
}
