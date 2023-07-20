

public class SLLReverseList {
	class Node {
		int data;
		Node next;

		public void Node(int data) {
			this.data = data;
			this.next = next;
		}
	}
	
	public Node head = null;
    public Node tail = null;
    
    public void addNode(int data)
    {
    	Node newNode = new Node();
    	if(head == null) {
    		head = newNode;
    		tail = newNode;
    	}
    	else {
    		tail.next = newNode;
    		tail = newNode;
    	}
    }
   public void reverseIterate(Node head) {

	   if(head == null || head.next == null) {
		   return;
	   }
	   
	   Node currNode =  head.next;
	   Node prevNode = head;
	   
	   while(currNode != null) {
		   Node nextNode = currNode.next;
		   currNode.next = prevNode;
		   //update
		   prevNode = currNode;
		   currNode = nextNode;
		   
	   }
   }

   public void display() {
	   Node current = head;
	   if(head== null) {
		   System.out.println("list is empty");
		   return;
	   }
	   while (current != null) {
		   System.out.println(current.data);
		  // current = current.next;
	   }
		
	}
   public static void main(String[] args) {
	SLLReverseList list = new SLLReverseList()
;
	list.addNode(5);
	list.addNode(8);
	list.addNode(6);
	list.addNode(3);
	list.addNode(1);
	list.addNode(12);
	System.out.println("Reverse List are" +"---->");
	list.reverseIterate(list.head);
	list.display();
   }
   }
