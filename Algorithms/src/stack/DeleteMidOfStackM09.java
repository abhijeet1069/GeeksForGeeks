package stack;

import java.util.Stack;

class Solution4
{
    boolean flag = true;
	public void recursion(Stack<Integer>s,int mid) {
    	if(s.size() == 0)
    		return;
    	else {
    		int index=s.size()-1; //each frame of function call stack is behaving as an array 
    		int val = s.pop();    //element with corresponding value and index
    		recursion(s,mid); //first empty the stack then go for below statements
        	if(index != mid-1) //skip only the middle index element
        		s.push(val);
    	}
    	
    }
    
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
       int mid = (int) Math.ceil(s.size()/2.0);
       recursion(s,mid);
    } 
}

public class DeleteMidOfStackM09 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		Stack<Integer> s = new Stack<>();
		s.push(1);s.push(2);s.push(3);s.push(4);
		sol.deleteMid(s, s.size());
		System.out.println(s.toString());
	}

}
