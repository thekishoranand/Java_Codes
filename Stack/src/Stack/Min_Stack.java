package Stack;

import java.util.Stack;

public class Min_Stack {

	private Stack<Integer> s = new Stack<>();
	private int min;
	
	
	public void push(int item) {
		if(s.isEmpty()) {
			s.push(item);
			this.min = item;
		}
		else if(item>=min) {
			s.push(item);
		}
		else {
			int val = 2*item - min;
			s.push(val);
			min = item;  
		}
	}
	public int pop() throws Exception {
		if(s.isEmpty()) {
			throw new Exception("Pgl h kua");
		}
		if(s.peek() >= min) {
			return s.pop();
		}
		else {
			int val = s.pop();
			int orig_item = min;
			min = 2*orig_item-val;
			return orig_item;
		}
	}
	
	public int peek() throws Exception {
		if(s.isEmpty()) {
			throw new Exception("Pgl h kua");
		}
		if(s.peek() >= min) {
			return s.peek();
		}
		else {
			int orig_item = min;
			return orig_item;
		}
	}
public int min() {
	return min;
}
}

