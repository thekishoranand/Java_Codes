package LinkedListEx;



public class LinkedListEx1 {
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

	public void addAtAnyIndex(int k, int item) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("Aukaat me reh");
		}
		if (k == 0) {
			addFirst(item);
		} else if (k == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = getNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
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

	// get () function <for getting data of the node>
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		return tail.data;
	}

	public int getAtAnyIndex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		return this.getNode(k).data;
	}

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LinkedList is empty");
		}
		Node temp = this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}
		return temp.data;
	}

public int removeLast() throws Exception{
	if(this.size == 0) {
		throw new Exception("LinkedList is Empty");
	}
	if(this.size == 1) {
		return removeFirst();
		}
	else {
		Node secLast = getNode(this.size-2);  //Isme hm size-1 tak isliye le rhe kyoki indexing 0 se hai
				//agar indexing 1 se hoti to node-1 lete
	int item = secLast.next.data;
	this.tail = secLast;
	this.tail = null;
	this.size--;
	return item;
	}
}

public int removeAtAnyIndex(int k) throws Exception {
	if(this.size == 0) {
		throw new Exception("LinkedList is empty");
	}
	if(k==0) {
		return removeFirst();
	}
	if(k==this.size) {
		return removeLast();
		}
	else {
		Node k_1thNode = getNode(k-1);
		Node kth = k_1thNode.next;
		k_1thNode.next = kth.next;
	kth.next = null;
	this.size--;
	return kth.data;
	}
}


	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
