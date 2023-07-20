package LinkedList30;



public class Flyod_Cycle_Detection {

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
     public void create_Cycle() {
    	 this.tail.next = this.head; // Circular LinkedList made
     }
     public boolean isCycle() {
    	 Node Slow = head;
    	 Node Fast = head;
    	 
    	 while(Fast != null && Fast.next != null) {
    		 Fast = Fast.next.next;
    		 Slow = Slow.next;
    		 
    		 if(Fast == Slow) {
    			 return true;
    		 }
    	 }
    	 return false;
     }
 public static void main(String args[])
 {
	  Flyod_Cycle_Detection fd= new  Flyod_Cycle_Detection();
	  fd.addLast(10);
	  fd.addLast(20);
	  fd.addLast(30);
	  fd.addLast(40);
	  fd.addLast(50);
	   fd.create_Cycle();
	   System.out.println(fd.isCycle());
	  }
}


