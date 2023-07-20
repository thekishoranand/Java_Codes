package LinkedList30;



public class Merge_Sort_LL {

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {
			
		}

		ListNode(int x) {
			val = x;
		}
	}
 
	
	class Solution {
		 public ListNode sortList(ListNode head) {
			 if(head == null || head.next == null) {
					return head;
				}
			 ListNode midnode = mid(head);
			 ListNode midnode_next = midnode.next   ;
			 midnode.next = null;
			 
			 ListNode l1 = sortList(head);
             ListNode l2 = sortList(midnode_next);	
             return mergeTwoLists(l1,l2);
		 }
		 public ListNode mid(ListNode head){
	    		ListNode Slow = head;
				ListNode Fast = head;
				
				while(Fast != null && Fast.next !=null) {
					Fast = Fast.next.next;
					Slow = Slow.next;
				}
				return Slow;
					}
	    }
             
             public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            	 
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
 
