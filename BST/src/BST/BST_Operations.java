package BST;

public class BST_Operations {
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

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static boolean search(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.data > key) {
			return search(root.left, key);
		} else if (root.data < key) {
			return search(root.right, key);
		} else {
			return true; // root.data == key
		}

	}

	public static Node delete(Node root, int val) {
		// Search the part
		if (root.data > val) {
			root.left = delete(root.left, val);
		} else if (root.data < val) {
			root.right = delete(root.right, val);
		} else { // root.data == val
			// case1
			if (root.left == null && root.right == null) {
				return null;
			}
			// case2
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// case3
			Node IS = inorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}

	public static Node inorderSuccessor(Node root) {  //root left
		while (root.left != null) {
			root = root.left;
		}
		return root; // returning root value
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = { 8, 5, 3, 1, 4, 6,8,9, 10, 11, 14 };
		Node root = null;

		for (int i = 0; i < values.length; i++) {
			root = insert(root, values[i]); // root ke andar changes karke final val de dega

		}
		inorder(root);
		System.out.println();

		delete(root, 4);
		inorder(root);
		delete(root, 10);
		inorder(root);
		delete(root, 5);
	}

}
