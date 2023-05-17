package Data_Structures;
/*
 * >It is a type of binary tree in which the difference between the height of the left and 
 *  the right subtree for each node is either 0 or 1.
 *
 *
 */
public class B2BalancedBT {

	Node root;
	
	public B2BalancedBT(int ket) {
		root = new Node(ket);
	}
	
	public B2BalancedBT() {
		root = null;
	}

	//postOrder 
	void postOrder(Node node) {
		if(node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.item+"->");
	}

	//inorder
	void inorder(Node node) {
		if(node == null)
			return;

		inorder(node.left);
		System.out.print(node.item+"->");
		inorder(node.right);
	}

	//preorder
	void preOrder(Node node) {
		if(node == null)
			return;

		System.out.print(node.item+"->");

		preOrder(node.left);
		preOrder(node.right);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2BalancedBT tree = new B2BalancedBT();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Inorder Traversal :");
		tree.inorder(tree.root);
		
		System.out.println("\nPreorder Traversal :");
		tree.preOrder(tree.root);
		
		System.out.println("\nPostorder Traversal :");
		tree.postOrder(tree.root);
		

	}

}
