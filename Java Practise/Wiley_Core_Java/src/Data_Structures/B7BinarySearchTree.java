package Data_Structures;

//Binary search tree operations
//
//class BST {
//	boolean search(Node root, int x) {
//		if(root == null) return false;
//		
//		if(root.data  == x) return true;
//		
//		if(root.data > x) {
//			return search(root.left, x);
//		}
//		
//		return search(root.right, x);
//	}
//}

public class B7BinarySearchTree {
	class Node{
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	public B7BinarySearchTree() {
		root = null;
	}

}
