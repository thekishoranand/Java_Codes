package LinkedListEx;

import java.util.LinkedList;

public class Stack_Using_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> lls = new LinkedList<>();
  lls.addFirst(10);
  lls.addFirst(20);
  lls.addFirst(30);
  System.out.println(lls);
  System.out.println(lls.remove());
	}

}
