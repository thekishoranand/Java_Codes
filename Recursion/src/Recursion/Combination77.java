//Based on Queen Combination
package Recursion;

import java.util.*;


public class Combination77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean [] board = new boolean [4];
        combination(board, 2, 0,list, ans, 0);
        System.out.println(ans);
	}
	public static void combination(boolean[] board,int tq,int qpsf,List<Integer> list, List<List<Integer>>  ans, int last_index) {
		if (tq == qpsf) {
			//System.out.println(ans);
			ans.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = last_index; i < board.length; i++) {
			if (!board[i]) {
				board[i] = true;// do
				list.add(i+1);

				combination(board, tq, qpsf + 1, list,ans, i + 1);// work

				board[i] = false;// undo
				list.remove(list.size()-1);
			}
		}
	}

}
