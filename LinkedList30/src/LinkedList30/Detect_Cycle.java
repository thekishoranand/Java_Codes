package LinkedList30;



public class Detect_Cycle {
	private class Node {
		int data;
		Node next;
	}

// adding data member of linked list agar node ka hota to Node class ke andar define karte
	private Node head;
	private Node tail;
	private int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	public void addLast(int item) {

		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			this.tail = nn;

		}
	}
	private Node getNode(int k) throws Exception {
		if (k < 0 || k == this.size) {
			throw new Exception("k out of range hai");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

}