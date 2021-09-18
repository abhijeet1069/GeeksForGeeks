package stack;

class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1; //started on left side of array
		top2 = size; //started on right side of array
	}
}

class Stacks
{
    //Notice top pointer of stack. Direction reversed for both stacks
    void push1(int x, TwoStack sq)
    {
        if(sq.top1+1 < sq.top2 ){ //stack1 has always to be left of stack2
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top2-1 > sq.top1){
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        int val = -1;
        if(sq.top1 >= 0){
            val = sq.arr[sq.top1];
            sq.top1--;
        }
        return val;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        int val = -1;
        if(sq.top2 < sq.size){
            val = sq.arr[sq.top2];
            sq.top2++;
        }
        return val;
    }
}
public class TwoStacksInArrayM07 {

	public static void main(String[] args) {
		TwoStack sq = new TwoStack();
		Stacks s = new Stacks();		
		s.push1(2,sq);
		s.push1(3,sq);
		s.push2(4,sq);
		System.out.println(s.pop1(sq)); //O/P : 3
		System.out.println(s.pop2(sq)); //O/P : 4
		System.out.println(s.pop2(sq)); //O/P : -1

	}

}
