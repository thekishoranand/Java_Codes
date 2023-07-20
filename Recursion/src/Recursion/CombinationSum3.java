package Recursion;
import java.util.*;
public class CombinationSum3 {

	public List<List<Integer>> combinationSum3(int tq, int n) {
	        List<List<Integer>> ans = new ArrayList<>();
	 		List<Integer> list = new ArrayList<>();
	         boolean []board = new boolean[9]; 
	 				   combination(board, tq, 0,list, ans, 0,0,n);
	 					 return ans;	

	}
	    
	     
	     public static void combination(boolean[] board,int tq,int qpsf,List<Integer> list, List<List<Integer>>  ans, int last_index, int sum, int n) {
	 		if (tq == qpsf) {
	 			//System.out.println(ans);
	             if(sum==n)
	 			ans.add(new ArrayList<Integer>(list));
	 			return;
	 		}

	 		for (int i = last_index; i < board.length; i++) {
	 			if (!board[i]) {
	 				board[i] = true;// do
	 				list.add(i+1);

	 				combination(board, tq, qpsf + 1, list,ans, i + 1,sum+(i+1),n);// work

	 				board[i] = false;// undo
	 				list.remove(list.size()-1);
	 			}
	 		}
	 	}
	 }

 
