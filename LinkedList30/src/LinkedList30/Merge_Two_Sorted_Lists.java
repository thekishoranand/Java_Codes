package LinkedList30;



public class Merge_Two_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	
	class Solution {
	    public ListNode Merge_Two_Sorted_Lists(ListNode list1, ListNode list2) {
	        
	    	 ListNode temp = new ListNode(-1); // argument pass karna hoga pr jaruri nai hai.
	         ListNode ans = temp ; 
	         while(list1 != null && list2 != null){
	                 if(list1.val < list2.val){
	                     temp.next = list1;
	                     temp = temp.next;
	                     list1 = list1.next;
	                 }
	                 else{
	                     temp.next = list2;
	                     temp = temp.next;
	                     list2 = list2.next;
	                 }
	             }
	             if(list1 != null){
	                 temp.next = list1;
	             }
	             if(list2 != null){
	                 temp.next = list2;
	             }
	    
	              return ans.next;
	    }
}
}
	        
	     
