package LinkedList30;

public class Middle_LinkedListEx {
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
		
				public int mid() {
			Node Slow = this.head;
			Node Fast = this.head;
			
			while(Fast != null && Fast.next !=null) {
				Fast = Fast.next.next;
				Slow = Slow.next;
			}
			return Slow.data;
				}
		
			public static void main(String[] args) {
				Middle_LinkedListEx ml = new Middle_LinkedListEx();
				ml.addLast(10);
				ml.addLast(20);
				ml.addLast(30);
				ml.addLast(40);
				ml.addLast(50);
				ml.addLast(60);
				System.out.println(ml.mid());
	}

}
