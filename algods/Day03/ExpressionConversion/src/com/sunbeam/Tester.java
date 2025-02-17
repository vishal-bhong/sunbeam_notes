package com.sunbeam;

import java.util.Stack;

public class Tester {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '*': return 7;
		case '/': return 7;
		case '%': return 7;
		case '+': return 5;
		case '-': return 5;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix){
		//1. create stack to push operators
		Stack<Character> st = new Stack<Character>();
		//2. create string to store postfix expression
		StringBuilder postfix = new StringBuilder();
		//3. check expression from left to right
		for(int i = 0 ; i < infix.length() ; i++) {
			//4. extract character of ith index
			char ele = infix.charAt(i);
			//5. if element is operanad
			if(Character.isDigit(ele))
				//5.1 append element into postfix expression
				postfix.append(ele);
			//6. if eleemnt is '('
			else if(ele == '(')
				//6.1 push '(' on stack directly
				st.push(ele);
			//7. if element is ')'
			else if(ele == ')') {
				//7.1 pop operators from stack and append to postfixx expression untill opening bracket 
				while(st.peek() != '(')
					postfix.append(st.pop());
				//7.2 pop opening bracket and discard it
				st.pop();
			}
			//8. if element is operator
			else {
				while(!st.isEmpty() && priority(st.peek()) >= priority(ele))
						postfix.append(st.pop());
				//8.2 push current element into stack
				st.push(ele);
			}
		}
		//9. pop remaining operators from stack and append into postfix expression
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		//10. return postfix expression
		return postfix.toString();
		
	}
	
	public static String infixToPrefix(String infix){
		//1. create stack to push operators
		Stack<Character> st = new Stack<Character>();
		//2. create string to store prefix expression
		StringBuilder prefix = new StringBuilder();
		//3. check expression from right to left
		for(int i = infix.length()-1 ; i >= 0 ; i--) {
			//4. extract character of ith index
			char ele = infix.charAt(i);
			//5. if element is operanad
			if(Character.isDigit(ele))
				//5.1 append element into prefix expression
				prefix.append(ele);
			//6. if eleemnt is ')'
			else if(ele == ')')
				//6.1 push ')' on stack directly
				st.push(ele);
			//7. if element is '(
			else if(ele == '(') {
				//7.1 pop operators from stack and append to postfixx expression untill opening bracket 
				while(st.peek() != ')')
					prefix.append(st.pop());
				//7.2 pop opening bracket and discard it
				st.pop();
			}
			//8. if element is operator
			else {
				while(!st.isEmpty() && priority(st.peek()) > priority(ele))
						prefix.append(st.pop());
				//8.2 push current element into stack
				st.push(ele);
			}
		}
		//9. pop remaining operators from stack and append into postfix expression
		while(!st.isEmpty()) {
			prefix.append(st.pop());
		}
		// reverse prefix string
		prefix.reverse();
		//10. return postfix expression
		return prefix.toString();
		
	}

	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";
		
		System.out.println("Infix : " + infix);
		String postfix  = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
		
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix : " + prefix);
	}

}









