package LinkedListEx;

import java.util.LinkedList;

public class Queue_Using_Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> llq = new LinkedList<>();
		
		llq.add(10);
		llq.add(20);
		llq.add(30);
		System.out.println(llq);
		llq.remove();
		System.out.println(llq);
	}

}
