package LinkedList30;

public class Reverse_LinkedList {
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

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void ReverseData_I() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left < right) {
			Node left_node = getNode(left);
			Node right_node = getNode(right);
			int temp = left_node.data;
			left_node.data = right_node.data;
			right_node.data = temp;

			left++;
			right--;
		}
	}

	
		public void reverseList_Pointer() {
			Node prev = null;
			Node curr = head;
			while (curr != null) {
				Node ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		}
	

	public static void main(String[] args) throws Exception {
		Reverse_LinkedList rc = new Reverse_LinkedList();
		rc.addFirst(1);
		rc.addLast(2);
		rc.addLast(3);
		rc.addLast(4);
		rc.addLast(5);
		rc.addLast(6);
		rc.addLast(7);
		rc.addLast(8);
		rc.Display();
		//rc.ReverseData_I();
		rc.Display();
		rc.reverseList_Pointer();
		rc.Display();
	}

}
