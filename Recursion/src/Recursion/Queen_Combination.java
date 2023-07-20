package Recursion;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		combination(board, 2, 0, "", 0);
	}

	public static void combination(boolean[] board, int tq, int qpsf, String ans, int last_index) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}

		for (int i = last_index; i < board.length; i++) {
			if (!board[i]) {
				board[i] = true;// do

				combination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf + " ", i + 1);// work
//yha pe undo bs index hoga, heap me jo same loc me content change hoga uspe undo nai hoga due to backtrack kar rahe hai
				board[i] = false;// undo
			}
		}
	}

}
