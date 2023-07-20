
  public class SLL {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
//	public Node tail = null; 

// add first,last
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			// tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		 currNode.next = newNode;
	}

	


	public void printList() {
		Node currNode = head;

		if (head == null) {
			System.out.println("LIST IS EMPTY");
			return;
		}
		while (currNode != null) {
			System.out.println(currNode.data + "");
			currNode = currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SLL list = new SLL();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3); 

	list.addLast(123);
		list.printList();
	}
}