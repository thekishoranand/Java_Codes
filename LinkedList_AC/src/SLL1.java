public class SLL1 {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

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
		while (currNode.next != null) {
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

	// delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		head = head.next;
	}
	// delete Last

	public void deleteLast() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		// contains only one node in list
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;   // prev Node
		Node lastNode = head.next; // current Node
		while (lastNode.next != null) {   //(currentNode.next != null)
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public static void main(String[] args) {
		SLL1 list = new SLL1();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		
		list.deleteFirst();
		list.printList();
	}

}
