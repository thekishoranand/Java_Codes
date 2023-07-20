package Recursion;

public class Queen_Permutation {

	public static void main(String[] args) {
		boolean[] board = new boolean[4]; //bydefualt false fill hoga 
       permutation(board, 2, 0,"");
	}

	public static void permutation(boolean[] board, int tq, int qpsf, String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
 			if (!board[i]) {
				board[i] = true;//do

				permutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ");//work
//yha pe undo bs index hoga, heap me jo same loc me content change hoga uspe undo nai hoga due to backtrack kar rahe hai
				board[i] = false;//undo
			}
		}
	}

}
