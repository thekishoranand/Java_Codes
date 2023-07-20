package BST;

public class Print_In_Range {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data; // ye node me data fill karega
		}
	}

	public static Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val); // new node create kar lenge
			return root;
		}
		if (root.data > val) { // left sub tree
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}

		return root;
	}

	public static void printInrange(Node root, int X, int Y) {
//		if(root == null) {
//			return;
//		}
//		if(root.data >= X && root.data <= Y) {
//			printInrange(root.left, X, Y);
//			System.out.println(root.data + " ");
//			printInrange(root.right, X, Y);
//		}
//		else if(root.data >= Y) {
//			printInrange(root.left, X, Y);
//		}
//		else{
//			printInrange(root.right, X, Y);
//		}
//	}

		if (root == null) {
			return; // base case.
		}
		if (root.data >= X && root.data <= Y) {
			printInrange(root.left, X, Y);
			System.out.println(root.data + " ");
			printInrange(root.right, X, Y);
		}
		else if (root.data <= X) {
			printInrange(root.right, X, Y); // left branch excluded.
		} else { //
			printInrange(root.left, X, Y);
		} // right branch excluded.
	}

	public static void main(String[] args) {
		int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
		Node root = null;

		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]); // root ke andar changes karke final val de dega
		}

		printInrange(root, 6, 10);
	}

}
