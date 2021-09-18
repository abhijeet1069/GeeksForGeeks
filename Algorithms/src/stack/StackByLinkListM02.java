package stack;

class StackNode{
	int data;
	StackNode next;
	StackNode(int a){
		this.data = a;
		this.next = null;
	}
}

class MyStack 
{
    StackNode top = null;
    
    //Storing previous values of top in temp.next . Thus using linklist to go backwards
    void push(int a){
        StackNode temp = new StackNode(a);
        temp.next = top; //storing previous address of top
        top = temp;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        int value;
        if(top == null)
            value = -1;
        else{
            value = top.data;
            top=top.next; //moving to previous node
        }
        return value;
    }
}

public class StackByLinkListM02 {
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(4);
		s.push(8);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
