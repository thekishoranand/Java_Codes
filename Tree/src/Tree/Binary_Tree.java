package Tree;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Binary_Tree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public Node() {

		}

	}

	//
	private Node root;

	public Binary_Tree() {
		this.root = create_tree(null, true); // is right child
	}

	private Node create_tree(Node parent, boolean isRightChild) {
		if (parent == null) {
			System.out.println("Enter root Node");
		} else {
			if (isRightChild == false) {
				System.out.println("Enter data of left child" + parent.data);
			} else {
				System.out.println("Enter data of right child" + parent.data);
			}
		}
		int item = sc.nextInt();
		Node nn = new Node(item);
		System.out.println("has a left child " + nn.data);
		boolean hasLeftChild = sc.nextBoolean();
		if (hasLeftChild) {
			nn.left = create_tree(nn, false);
		}
		System.out.println("has a right child " + nn.data);
		boolean hasRightChild = sc.nextBoolean();
		if (hasRightChild) {
			nn.right = create_tree(nn, true);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "<--" + nn.data;
		if (nn.left != null) {
			str = nn.left.data + str;
		} else {
			str = "." + str;
		}
		str = str + "-->";
		if (nn.right != null) {
			str = str + nn.right.data;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		display(nn.left);
		display(nn.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean lb = find(node.left, item);
		boolean rb = find(node.right, item);
		return lb || rb;
	}

	public int find_min() {
		return find_min(this.root);
	}

	private int find_min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int smin = node.data; // self minimum
		int leftmin = find_min(node.left);
		int rightmin = find_min(node.right);
		return Math.min(leftmin, Math.min(smin, rightmin));

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);
		return ls + rs + 1;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}
	
//Tree traversal 1	

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data + "");
		PreOrder(node.left);
		PreOrder(node.right);

	}
	
//Tree Traversal 2

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}

		PostOrder(node.left);
		PostOrder(node.right);
		System.out.println(node.data + "");

	}
//Tree Traversal 3

	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}

	private void InOrder(Node node) {
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.println(node.data + "");
		InOrder(node.right);

	}
}
