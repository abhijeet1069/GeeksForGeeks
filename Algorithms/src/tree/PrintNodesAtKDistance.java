package tree;

class Node{
	Node left;
	int data;
	Node right;
	
	Node(int data){
		this.left = null;
		this.data = data;
		this.right = null; 
	}
}

public class PrintNodesAtKDistance {

	public static void printNode(Node root, int height) { //assign height of each call stack starting with 1
		if(root == null)
			return;
		else {
			if(height == 4)
				System.out.println(root.data);
			printNode(root.left,height+1);
			printNode(root.right, height+1);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.right = new Node(70);
		printNode(root,1);
	}

}
