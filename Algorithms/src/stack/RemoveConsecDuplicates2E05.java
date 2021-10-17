package stack;

import java.util.Stack;

class Solution1
{
    //Function to remove pair of duplicates from given string using Stack.
    public String removePair(String str)
    {
        Stack<Character> st = new Stack<>();
    	for(int i = 0; i < str.length(); i++) {
    	if(st.empty() || st.peek() != str.charAt(i))
    		st.push(str.charAt(i));
    	else
    		st.pop();
    }
    	String res = "";
    	while(!st.empty())
    		res = st.pop()+res;
    	if(res.contentEquals(""))
    		res = "Empty String";
    	return res;
    }
}

public class RemoveConsecDuplicates2E05 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.removePair("aaabbaaccd")); // O/P - ad
		System.out.println(s.removePair("aaaa")); // O/P - Empty String
	}

}
