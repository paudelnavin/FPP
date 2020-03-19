package Lesson_9;

import java.util.Stack;

public class StackQues_2 {
	
	public static void main(String[] args) {
		
//		String str = "c{((a+b[(x+y)]+10)]}";
		String str = "((()))";
        int count=0;
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < str.length(); i++) {
        	char oneItem = str.charAt(i);
            count=1;
        	if(oneItem == '{' || oneItem == '[' || oneItem == '(') {
        		st.push(oneItem);
        	}
        	else if(oneItem == '}' || oneItem == ']' || oneItem == ')') {
            		if(!(st.empty())) {
            			char topItemOfStack = st.peek();
        	           
                		if(topItemOfStack=='(' && oneItem==')') {
        	    			st.pop();
        	    			count--;
        	    		}
        	    		if(topItemOfStack=='{' && oneItem=='}') {
        	    			st.pop();
        	    			count--;
        	    		}
        	    		if(topItemOfStack=='[' && oneItem==']') {
        	    			st.pop();
        	    			count--;
        	    		}
        	    		if(count==1)
        	    			break;
        	    		
            		}else
            			break;
            	}
        }
        
        if(count==0)
        	System.out.println("Balanced? Balanced");
        else
        	System.out.println("Balanced? Not Balanced");
	}
 }
