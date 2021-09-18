package stack;

import java.util.Stack;

class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public String removeConsecutiveDuplicates(String str)
    {
        Stack<Character> st = new Stack<>();
       for(int i = 0; i < str.length(); i++){
    	   try {
    	   if(str.charAt(i) != st.peek())
    		   st.push(str.charAt(i));
    	   }
    	   catch(Exception e) {	
    		   st.push(str.charAt(i));
    	   }
       }
    	String res = "";
    	while(!st.empty())
    		res = st.pop()+res;
    	
    	return res;
    }
}

public class RemoveConsecDuplicatesM04 {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.removeConsecutiveDuplicates("aaaaaabaabccccccc")); //O/P - ababc
		System.out.println(s.removeConsecutiveDuplicates("abbccbcd")); //O/P - abcbcd
	}

}
