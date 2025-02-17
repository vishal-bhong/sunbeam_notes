package com.sunbeam;

import java.util.Stack;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, int op2, char opr) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String postfix) {
		//1. create stack to push operands
		Stack<Integer> st = new Stack<Integer>();
		//2. check expression from left to right
		for(int i = 0 ; i < postfix.length() ; i++) {
			//3. extract element of ith index
			char ele = postfix.charAt(i);
			//3. if element is operand
			if(Character.isDigit(ele))
				// push it on stack
				st.push(ele - '0');	// to convert character into digit
			//4. if element is operator
			else {
				//5. pop two operands from stack
				int op2 = st.pop();
				int op1 = st.pop();
				//6. perfrom operation (op1, op2, ele)
				int res = calculate(op1, op2, ele);
				//7. push result on stack
				st.push(res);
			}
		}
		//8. pop and return final result
		if(!st.isEmpty())
			return st.pop();
		
		return 0;
	}
	
	public static int prefixEvaluate(String prefix) {
		//1. create stack to push operands
		Stack<Integer> st = new Stack<Integer>();
		//2. check expression from left to right
		for(int i = prefix.length()-1 ; i >= 0 ; i--) {
			//3. extract element of ith index
			char ele = prefix.charAt(i);
			//3. if element is operand
			if(Character.isDigit(ele))
				// push it on stack
				st.push(ele - '0');	// to convert character into digit
			//4. if element is operator
			else {
				//5. pop two operands from stack
				int op1 = st.pop();
				int op2 = st.pop();
				//6. perfrom operation (op1, op2, ele)
				int res = calculate(op1, op2, ele);
				//7. push result on stack
				st.push(res);
			}
		}
		//8. pop and return final result
		if(!st.isEmpty())
			return st.pop();
		
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";
		
		System.out.println("Prefix : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);

	}

}
















