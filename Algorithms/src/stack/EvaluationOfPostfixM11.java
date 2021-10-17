package stack;

import java.util.Stack;

public class EvaluationOfPostfixM11 {
	
	public static int evaluatePostFix(String S)
    {
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			int a,b;
			switch(ch) {
				case '+' : b = stack.pop(); 
						   a = stack.pop();
						   stack.push(a+b);
						   break;
				case '-' : b = stack.pop(); 
				           a = stack.pop();
				           stack.push(a-b);
				           break;
				case '*' : b = stack.pop(); 
		           		   a = stack.pop();
		           		   stack.push(a*b);
		           		   break;
				case '/' : b = stack.pop(); 
		           		   a = stack.pop();
		                   stack.push(a/b);
		                   break;
		        default :  stack.push(ch-'0');
		        		    break;
			}
		}
		return stack.pop();
    }
	public static void main(String[] args) {
		System.out.println(evaluatePostFix("123+*8-"));
	}

}
