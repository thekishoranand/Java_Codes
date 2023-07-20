package Stack;

public class Stack {
	private int[] data; // data = new int[5];
	private int top = -1;

	public Stack() {
		this.data = new int[5];
	}
// there is no need of constructor we can also initialize the size of array while declaring in class
	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == data.length - 1;  //array ka name data hai
	}

	public int size() {
		return this.top + 1;  // top = -1 then (top+1 =0)
	}

	public void push(int item) throws Exception {
		if (this.isFull()) {
			throw new Exception("Pgl hai kya stack full hai");
		}
		top++;  //Kyouki top -1 pe hai aur array 0 se start hai 
		this.data[this.top] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pgl hai kya stack khaali hai");
		}
		int item = this.data[this.top];
		top--;
		return item;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pgl hai kya stack khaali hai");
		}
		int item = this.data[this.top];
		return item;
	}
	public void Display() {
		for(int i=0;i <= this.top;i++) {
			System.out.print(this.data[i]+"--->");
		}
		System.out.println(".");
	}
 
}
