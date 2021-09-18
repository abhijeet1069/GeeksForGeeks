package stack;

import java.util.Stack;

class Geeks
{
    //Simple usage of inbuilt stack class.
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
    }
    
    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        st.pop();
    }
    
    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
       System.out.println(st.peek());
    }
    
    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        boolean flag = false;
        if(st.search(val) != -1)
            flag = true;
        return flag;
    }
}

public class OperationsOnStackE03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
