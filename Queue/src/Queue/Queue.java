package Queue;

public class Queue {
	private int[] data;
	private int front;
	private int size = 0;

	public Queue() {
		this.data = new int[5];
		this.front = 0; // kaha se element nikalenge
		this.size = 0; // kaha element rakhenge saath hi saath queue ka           size v btayega
	}

	public Queue(int cap) {// capacity btayega queue ki
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;

	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public boolean isFull() {
		return this.size == this.data.length;
	}
	public int size() {
		return this.size;
	}
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue full hai,element add ni hoga");
		}
		//this.data[this.size] = item;  (Linear Queue)
		int i = (this.front + this.size)% this.data.length;
		this.data[i] = item;
		size++;
		 
	}
	
	public int Dequeue() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("kuch ni milega");
		}
		int item = this.data[this.front];  //Data ko front se nikal rhe hai
		this.front =(this.front +1)%this.data.length;
	//	this.front++; (Linear Queue)
		this.size--;
		return item;
	}
	
	public int GetFront() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("kuch ni milega");
		}
		int item = this.data[this.front]; 
		return item;
	}
	public void Display() {
		for(int i = 0;i<this.size;i++) {
			int index = (this.front + i)%this.data.length;
			System.out.print(this.data[index] + " ");
		}
		System.out.println(".");
	}
	
}
