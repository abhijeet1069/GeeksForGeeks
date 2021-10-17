package stack;

import java.util.Stack;

public class NextGreaterElementM13 {

	public static long[] nextLargerElement(long[] arr, int n) { 
        long[] larger = new long[n];
        Stack<Long> stack = new Stack<>();
        larger[arr.length-1] = -1;
        stack.push(arr[arr.length-1]);
        for(int i = arr.length-2; i >= 0; i--) {
        	while(!stack.empty() && arr[i] > stack.peek())
        		stack.pop();
        	if(stack.empty())
        		larger[i] = -1;
        	else
        		larger[i] = stack.peek();
        	stack.push(arr[i]);
        }
        return larger;
    } 
	
	public static void main(String[] args) {
		long price[] = new long[]{1, 3, 2, 4};
		long span[] = nextLargerElement(price,price.length);
		for(long num : span)
			System.out.print(num+" ");

	}

}
