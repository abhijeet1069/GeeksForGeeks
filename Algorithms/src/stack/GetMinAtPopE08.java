package stack;

import java.util.Stack;

class GetMin
{
    //Function to push all the elements into the stack.
    public Stack<Integer> _push(int arr[],int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++) 
        	s.push(arr[i]);
        return s;
    }
    
    public int min(Stack<Integer> st) {
    	@SuppressWarnings("unchecked")
		Stack<Integer> s = (Stack<Integer>)st.clone();
    	int min = s.pop();
    	while(!s.empty()) {
    		int val = s.pop();
    		if(min > val)
    			min = val;
    	}
    	return min;
    }
    
    //Try to come up with an optimized solution. If not possible then go with brute
    //force solution. Because brute force is also a solution.
    public void _getMinAtPop(Stack<Integer>s)
    {
    	int min;
        while(!s.empty()) {
        	min = min(s);
        	System.out.print(min+" ");
        	s.pop();
        }  	
    }
}

public class GetMinAtPopE08 {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		GetMin obj = new GetMin();
		obj._getMinAtPop(obj._push(arr, arr.length));
	}

}
