package stack;

import java.util.Stack;

class Solution3
{
    //Function to check if brackets are balanced or not. Better to use a hashmap instead of if else
	//Implemented using PG style and failed. No wonder why he used to run away from codes.
   public static char pairOf(char ch) {
    	char pair;
    	if(ch == '}')
    		pair = '{';
    	else if(ch == ')')
    		pair = '(';
    	else if(ch == ']')
    		pair = '[';
    	else
    		pair = 0;
    	
    	return pair;
    }
    public boolean ispar(String str)
    {
        Stack<Character> st = new Stack<>();
    	for(int i = 0; i < str.length(); i++) {
    	if(!st.empty()) {
    		if(st.peek() == pairOf(str.charAt(i)))
    			st.pop();
    		else
    			st.push(str.charAt(i));
    	}
    	else
    		st.push(str.charAt(i));
    }
    	
    	return st.empty();
    }
}

public class ParenthesisCheckerM06 {

	public static void main(String[] args) {
		Solution3 s= new Solution3();
		System.out.println(s.ispar("{([])}")); //Output - true
		System.out.println(s.ispar("([]")); //Output - false
	}

}
