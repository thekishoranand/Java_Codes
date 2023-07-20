package Tree;

public class BinaryTree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		bt.display();
		System.out.println(bt.find(2));
		System.out.println(bt.find_min());
	    System.out.println(bt.size());
	}

}
