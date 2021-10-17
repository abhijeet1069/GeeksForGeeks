package stack;

import java.util.Stack;

public class StockSpanM12 {

	 public static int[] calculateSpan(int price[], int n){
	        int[] span = new int[n];
	        Stack<Integer> stack = new Stack<>();
	        stack.push(0);
	        span[0] = 1;
	        for(int i = 1; i < n ; i++) {
	        	while(!stack.empty() && price[i] >= price[stack.peek()])
	        		stack.pop();
	        	if(stack.empty())
	        		span[i] = i+1;
	        	else
	        		span[i] = i-stack.peek();
	        	stack.push(i);
	        }
	        return span;
	    }
	
	public static void main(String[] args) {
		int price[] = new int[]{10, 4 ,5 ,90, 120, 80};
		int span[] = calculateSpan(price,price.length);
		for(int num : span)
			System.out.print(num+" ");

	}

}
