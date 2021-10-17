package stack;

import java.util.Stack;

class Solution5
{
    //TODO:Open braces should have highest priority. Always push
	
	public int priority(Character ch) {
		int res;
		if(ch == '+' || ch == '-')
			res = 1;
		else if(ch == '*' || ch == '/')
			res = 2;
		else if(ch == '^')
			res = 3;
		else
			res = 0;
		return res;
	}
	
	public String infixToPostfix(String exp) 
	{
		String res = "";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if(ch == '(')
				stack.push(ch);
			else if(ch == ')'){
				while(stack.peek() != '(')
					res += stack.pop();
				stack.pop(); //remove (
			}
			else {
				if(priority(ch) == 0)
					res += ch;
				else { //only operator allowed. Put lowest precedence operator on stack
					while(!stack.empty() && priority(ch) <= priority(stack.peek())) 
						res += stack.pop();
					stack.push(ch);
					}
				}
			}
		while(!stack.empty())
			res += stack.pop();
		return res; 
	} 
}

public class InfixToPostfixD10 {

	public static void main(String[] args) {
		String str = "A*(B+C)/D";
		Solution5 obj = new Solution5();
		System.out.println(obj.infixToPostfix(str));
	}

}
