package LinkedListEx;

import java.util.Scanner;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
	   
		LinkedListEx1 ll = new LinkedListEx1();
	//	Scanner scanner = new Scanner(System.in);
	  //for(int i=0;i<5;i++) {
     //	int item = scanner.nextInt();
    //  ll.addLast(item);
   //  }
		
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.Display();
		ll.addLast(56);
		ll.addLast(67);
		ll.Display(); 
		ll.addAtAnyIndex(0 ,90);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
    System.out.println(ll.getAtAnyIndex(2));
	}

}
