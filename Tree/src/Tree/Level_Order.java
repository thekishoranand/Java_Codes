package Tree;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.Scanner;



//We will use queue DATA_STRUCTURE here as It has the same showacse as it

public class Level_Order {

	
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

		public Level_Order() {
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
		
		
		public void Levelorder() {
			LinkedList<Node> q = new LinkedList<>();
			q.add(this.root);
			
			while(!q.isEmpty()) {
				Node remove = q.remove();
				System.out.println(remove.data);
				if(remove.left != null) {
					q.add(remove.left);
				}
				if(remove.right != null) {
					q.add(remove.right);
				}
		}

	}
		
		public void LevelorderLinewise() {
			LinkedList<Node> q = new LinkedList<>();
			LinkedList<Node> helper = new LinkedList<>();
			q.add(this.root);
			
			while(!q.isEmpty()) {
				Node remove = q.remove();
				System.out.println(remove.data + " ");
				if(remove.left != null) {
					helper.add(remove.left);
				}
				if(remove.right != null) {
					helper.add(remove.right);
				}
				if (q.isEmpty()) {
					q = helper;
					helper = new LinkedList<>();
					System.out.println();
				}
		}

	}
		public static void main(String[] args) {
			Level_Order lo= new Level_Order();
			lo.Levelorder();
		}


}
